package p001o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.lifecycle.AbstractC2145n;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.g32;
import p001o.m42;

/* loaded from: classes2.dex */
public final class ssh {

    /* renamed from: a */
    public final m42 f45891a;

    /* renamed from: b */
    public final hpb f45892b;

    /* renamed from: c */
    public final boolean f45893c;

    /* renamed from: d */
    public final Executor f45894d;

    /* renamed from: e */
    public boolean f45895e;

    /* renamed from: f */
    public g32.C13614a f45896f;

    /* renamed from: g */
    public boolean f45897g;

    public ssh(m42 m42Var, s82 s82Var, Executor executor) {
        this.f45891a = m42Var;
        this.f45894d = executor;
        Objects.requireNonNull(s82Var);
        this.f45893c = l27.m36450a(new q52(s82Var));
        this.f45892b = new hpb(0);
        m42Var.m38320t(new m42.InterfaceC15217c() { // from class: o.rsh
            @Override // p001o.m42.InterfaceC15217c
            /* renamed from: a */
            public final boolean mo16542a(TotalCaptureResult totalCaptureResult) {
                return this.f44034a.m48889d(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m48889d(TotalCaptureResult totalCaptureResult) {
        if (this.f45896f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f45897g) {
                this.f45896f.m28005c(null);
                this.f45896f = null;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m48890b(g32.C13614a c13614a, boolean z) {
        if (!this.f45893c) {
            if (c13614a != null) {
                c13614a.m28008f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f45895e) {
                m48893f(this.f45892b, 0);
                if (c13614a != null) {
                    c13614a.m28008f(new y82("Camera is not active."));
                    return;
                }
                return;
            }
            this.f45897g = z;
            this.f45891a.m38323w(z);
            m48893f(this.f45892b, Integer.valueOf(z ? 1 : 0));
            g32.C13614a c13614a2 = this.f45896f;
            if (c13614a2 != null) {
                c13614a2.m28008f(new y82("There is a new enableTorch being set"));
            }
            this.f45896f = c13614a;
        }
    }

    /* renamed from: c */
    public AbstractC2145n m48891c() {
        return this.f45892b;
    }

    /* renamed from: e */
    public void m48892e(boolean z) {
        if (this.f45895e == z) {
            return;
        }
        this.f45895e = z;
        if (z) {
            return;
        }
        if (this.f45897g) {
            this.f45897g = false;
            this.f45891a.m38323w(false);
            m48893f(this.f45892b, 0);
        }
        g32.C13614a c13614a = this.f45896f;
        if (c13614a != null) {
            c13614a.m28008f(new y82("Camera is not active."));
            this.f45896f = null;
        }
    }

    /* renamed from: f */
    public final void m48893f(hpb hpbVar, Object obj) {
        if (elh.m25222c()) {
            hpbVar.setValue(obj);
        } else {
            hpbVar.postValue(obj);
        }
    }
}
