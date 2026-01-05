package p001o;

import android.os.Handler;
import com.facebook.C10790j;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class and extends OutputStream implements rme {

    /* renamed from: a */
    public final Handler f15047a;

    /* renamed from: b */
    public final Map f15048b = new HashMap();

    /* renamed from: c */
    public GraphRequest f15049c;

    /* renamed from: d */
    public C10790j f15050d;

    /* renamed from: e */
    public int f15051e;

    public and(Handler handler) {
        this.f15047a = handler;
    }

    @Override // p001o.rme
    /* renamed from: a */
    public void mo13091a(GraphRequest graphRequest) {
        this.f15049c = graphRequest;
        this.f15050d = graphRequest != null ? (C10790j) this.f15048b.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final void m17520c(long j) {
        GraphRequest graphRequest = this.f15049c;
        if (graphRequest == null) {
            return;
        }
        if (this.f15050d == null) {
            C10790j c10790j = new C10790j(this.f15047a, graphRequest);
            this.f15050d = c10790j;
            this.f15048b.put(graphRequest, c10790j);
        }
        C10790j c10790j2 = this.f15050d;
        if (c10790j2 != null) {
            c10790j2.m13152b(j);
        }
        this.f15051e += (int) j;
    }

    /* renamed from: d */
    public final int m17521d() {
        return this.f15051e;
    }

    /* renamed from: f */
    public final Map m17522f() {
        return this.f15048b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        sq8.m48649h(bArr, "buffer");
        m17520c(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "buffer");
        m17520c(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m17520c(1L);
    }
}
