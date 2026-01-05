package w3;

import android.os.Bundle;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l4.C4367l;
import nj.InterfaceC5075a;
import p016r.InterfaceC6409a;
import qi.C6234q;
import qi.InterfaceC6222e;
import sf.AbstractC6840z;
import ue.InterfaceC7423e;
import ue.InterfaceC7425g;
import wj.AbstractC8087m;
import xj.C8391e;
import yg.C8656m;
import yg.InterfaceC8644a;
import z0.C8840f;
import z5.InterfaceC8871d;
import zj.C8984a;
import zj.C8985b;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C7892j implements InterfaceC8644a, InterfaceC5075a, InterfaceC7423e, InterfaceC7425g, InterfaceC6409a, InterfaceC8871d, InterfaceC6222e {

    /* renamed from: a */
    public final /* synthetic */ int f37810a;

    public /* synthetic */ C7892j(int i10) {
        this.f37810a = i10;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ AutofillId m14962d(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ AutofillValue m14963e(Object obj) {
        return (AutofillValue) obj;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m14964g(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // z5.InterfaceC8871d
    /* renamed from: a */
    public boolean mo6604a() {
        return false;
    }

    @Override // ue.InterfaceC7423e
    public Object apply(Object obj) {
        switch (this.f37810a) {
            case 8:
                C8391e c8391e = (C8391e) obj;
                c8391e.getClass();
                C4367l c4367l = AbstractC8087m.f38716a;
                c4367l.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c4367l.m9136p(c8391e, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 14:
                return null;
            default:
                return C8840f.f42554b;
        }
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) throws IOException {
        int i10;
        Object obj;
        switch (this.f37810a) {
            case 4:
                i10 = 403;
                break;
            case 5:
                i10 = -1;
                break;
            default:
                synchronized (c8656m.f41949a) {
                    AbstractC6840z.m13038i("Task is not yet complete", c8656m.f41951c);
                    if (c8656m.f41952d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(c8656m.f41954f)) {
                        throw ((Throwable) IOException.class.cast(c8656m.f41954f));
                    }
                    Exception exc = c8656m.f41954f;
                    if (exc != null) {
                        throw new RuntimeExecutionException(exc);
                    }
                    obj = c8656m.f41953e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i10);
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        Set setMo12239f = x0Var.mo12239f(C6234q.m12250a(C8984a.class));
        C8986c c8986c = C8986c.f43333c;
        if (c8986c == null) {
            synchronized (C8986c.class) {
                try {
                    c8986c = C8986c.f43333c;
                    if (c8986c == null) {
                        c8986c = new C8986c();
                        C8986c.f43333c = c8986c;
                    }
                } finally {
                }
            }
        }
        return new C8985b(setMo12239f, c8986c);
    }

    public /* synthetic */ C7892j(int i10, Object obj) {
        this.f37810a = i10;
    }

    @Override // ue.InterfaceC7425g
    /* renamed from: b */
    public void mo5428b(Exception exc) {
    }
}
