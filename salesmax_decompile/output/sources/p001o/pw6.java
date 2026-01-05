package p001o;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public final class pw6 extends AsyncTask {

    /* renamed from: a */
    public final String f40675a;

    /* renamed from: b */
    public final File f40676b;

    /* renamed from: c */
    public final InterfaceC16205a f40677c;

    /* renamed from: o.pw6$a */
    public interface InterfaceC16205a {
        /* renamed from: a */
        void mo40677a(File file);
    }

    public pw6(String str, File file, InterfaceC16205a interfaceC16205a) {
        sq8.m48649h(str, "uriStr");
        sq8.m48649h(file, "destFile");
        sq8.m48649h(interfaceC16205a, "onSuccess");
        this.f40675a = str;
        this.f40676b = file;
        this.f40677c = interfaceC16205a;
    }

    /* renamed from: a */
    public Boolean m44255a(String... strArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(strArr, "args");
            try {
                URL url = new URL(this.f40675a);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f40676b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public void m44256b(boolean z) {
        if (!a94.m16694d(this) && z) {
            try {
                this.f40677c.mo40677a(this.f40676b);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return m44255a((String[]) objArr);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m44256b(((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
