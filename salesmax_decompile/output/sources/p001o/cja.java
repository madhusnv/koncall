package p001o;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.PrivilegedAction;
import java.util.Properties;

/* loaded from: classes6.dex */
public final class cja implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ URL f18245a;

    public cja(URL url) {
        this.f18245a = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object run() throws Throwable {
        Throwable th;
        InputStream inputStream;
        StringBuffer stringBuffer;
        InputStream inputStream2 = null;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.f18245a.openConnection());
                uRLConnection.setUseCaches(false);
                inputStream = uRLConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused) {
                        if (eja.m25152t()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Unable to close stream for URL ");
                            stringBuffer2.append(this.f18245a);
                            eja.m25154v(stringBuffer2.toString());
                        }
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
            }
            throw th;
        }
        if (inputStream == null) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    if (eja.m25152t()) {
                        stringBuffer = new StringBuffer();
                        stringBuffer.append("Unable to close stream for URL ");
                        stringBuffer.append(this.f18245a);
                        eja.m25154v(stringBuffer.toString());
                    }
                }
            }
            return null;
        }
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (IOException unused4) {
            if (eja.m25152t()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Unable to read URL ");
                stringBuffer3.append(this.f18245a);
                eja.m25154v(stringBuffer3.toString());
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                    if (eja.m25152t()) {
                        stringBuffer = new StringBuffer();
                        stringBuffer.append("Unable to close stream for URL ");
                        stringBuffer.append(this.f18245a);
                        eja.m25154v(stringBuffer.toString());
                    }
                }
            }
            return null;
        }
    }
}
