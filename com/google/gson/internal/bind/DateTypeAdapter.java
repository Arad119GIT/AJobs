package com.google.gson.internal.bind;

import java.util.*;
import java.io.*;
import java.text.*;
import com.google.gson.stream.*;
import com.google.gson.*;
import com.google.gson.reflect.*;

public final class DateTypeAdapter extends TypeAdapter<Date>
{
    public static final TypeAdapterFactory FACTORY;
    private final DateFormat enUsFormat;
    private final DateFormat localFormat;
    private final DateFormat iso8601Format;
    
    public DateTypeAdapter() {
        this.enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
        this.localFormat = DateFormat.getDateTimeInstance(2, 2);
        this.iso8601Format = buildIso8601Format();
    }
    
    private static DateFormat buildIso8601Format() {
        final DateFormat iso8601Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
        return iso8601Format;
    }
    
    @Override
    public Date read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return this.deserializeToDate(in.nextString());
    }
    
    private synchronized Date deserializeToDate(final String json) {
        try {
            return this.localFormat.parse(json);
        }
        catch (ParseException ignored) {
            try {
                return this.enUsFormat.parse(json);
            }
            catch (ParseException ignored) {
                try {
                    return this.iso8601Format.parse(json);
                }
                catch (ParseException e) {
                    throw new JsonSyntaxException(json, e);
                }
            }
        }
    }
    
    @Override
    public synchronized void write(final JsonWriter out, final Date value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final String dateFormatAsString = this.enUsFormat.format(value);
        out.value(dateFormatAsString);
    }
    
    static {
        FACTORY = new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                return (TypeAdapter<T>)((typeToken.getRawType() == Date.class) ? new DateTypeAdapter() : null);
            }
        };
    }
}
