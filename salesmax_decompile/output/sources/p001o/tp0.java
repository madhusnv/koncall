package p001o;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class tp0 {

    /* renamed from: a */
    public static final tp0 f47515a = new tp0();

    /* renamed from: a */
    public final String m50277a(Context context, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "fileName");
        InputStream inputStreamOpen = context.getAssets().open(str);
        sq8.m48648g(inputStreamOpen, "context.assets.open(fileName)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpen, sh2.f45422b);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String strM51644d = uih.m51644d(bufferedReader);
            tb3.m49666a(bufferedReader, null);
            return strM51644d;
        } finally {
        }
    }
}
