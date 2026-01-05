package com.google.api.client.util;

import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface ObjectParser {
    <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls);

    Object parseAndClose(InputStream inputStream, Charset charset, Type type2);

    <T> T parseAndClose(Reader reader, Class<T> cls);

    Object parseAndClose(Reader reader, Type type2);
}
