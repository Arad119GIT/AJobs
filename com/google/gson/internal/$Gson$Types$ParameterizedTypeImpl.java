package com.google.gson.internal;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable
{
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;
    private static final long serialVersionUID = 0L;
    
    public ParameterizedTypeImpl(final Type ownerType, final Type rawType, final Type... typeArguments) {
        if (rawType instanceof Class) {
            final Class<?> rawTypeAsClass = (Class<?>)rawType;
            $Gson$Preconditions.checkArgument(ownerType != null || rawTypeAsClass.getEnclosingClass() == null);
            $Gson$Preconditions.checkArgument(ownerType == null || rawTypeAsClass.getEnclosingClass() != null);
        }
        this.ownerType = ((ownerType == null) ? null : $Gson$Types.canonicalize(ownerType));
        this.rawType = $Gson$Types.canonicalize(rawType);
        this.typeArguments = typeArguments.clone();
        for (int t = 0; t < this.typeArguments.length; ++t) {
            $Gson$Preconditions.checkNotNull(this.typeArguments[t]);
            $Gson$Types.access$000(this.typeArguments[t]);
            this.typeArguments[t] = $Gson$Types.canonicalize(this.typeArguments[t]);
        }
    }
    
    public Type[] getActualTypeArguments() {
        return this.typeArguments.clone();
    }
    
    public Type getRawType() {
        return this.rawType;
    }
    
    public Type getOwnerType() {
        return this.ownerType;
    }
    
    @Override
    public boolean equals(final Object other) {
        return other instanceof ParameterizedType && $Gson$Types.equals(this, (Type)other);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ $Gson$Types.access$100(this.ownerType);
    }
    
    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder(30 * (this.typeArguments.length + 1));
        stringBuilder.append($Gson$Types.typeToString(this.rawType));
        if (this.typeArguments.length == 0) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<").append($Gson$Types.typeToString(this.typeArguments[0]));
        for (int i = 1; i < this.typeArguments.length; ++i) {
            stringBuilder.append(", ").append($Gson$Types.typeToString(this.typeArguments[i]));
        }
        return stringBuilder.append(">").toString();
    }
}
