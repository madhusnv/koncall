package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.C10726c;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class yle extends le1 {
    public static final qme C0 = (qme) ((qme) ((qme) new qme().mo17819i(qt5.f42384c)).mo17814W(gid.LOW)).e0(true);
    public boolean A0;
    public boolean B0;
    public final Context o0;
    public final hme p0;
    public final Class q0;
    public final ComponentCallbacks2C10724a r0;
    public final C10726c s0;
    public ovh t0;
    public Object u0;
    public List v0;
    public yle w0;
    public yle x0;
    public Float y0;
    public boolean z0 = true;

    /* renamed from: o.yle$a */
    public static /* synthetic */ class C18428a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55682a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f55683b;

        static {
            int[] iArr = new int[gid.values().length];
            f55683b = iArr;
            try {
                iArr[gid.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55683b[gid.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55683b[gid.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55683b[gid.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f55682a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55682a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55682a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55682a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55682a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55682a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55682a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55682a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public yle(ComponentCallbacks2C10724a componentCallbacks2C10724a, hme hmeVar, Class cls, Context context) {
        this.r0 = componentCallbacks2C10724a;
        this.p0 = hmeVar;
        this.q0 = cls;
        this.o0 = context;
        this.t0 = hmeVar.m30823o(cls);
        this.s0 = componentCallbacks2C10724a.m12659i();
        t0(hmeVar.m30821m());
        n0(hmeVar.m30822n());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kzi A0(ImageView imageView) {
        le1 le1VarMo17810Q;
        uqi.m51920a();
        bgd.m18886d(imageView);
        if (!m37004N() && m37002L() && imageView.getScaleType() != null) {
            switch (C18428a.f55682a[imageView.getScaleType().ordinal()]) {
                case 1:
                    le1VarMo17810Q = r0().mo17810Q();
                    break;
                case 2:
                    le1VarMo17810Q = r0().mo17811R();
                    break;
                case 3:
                case 4:
                case 5:
                    le1VarMo17810Q = r0().mo17812S();
                    break;
                case 6:
                    le1VarMo17810Q = r0().mo17811R();
                    break;
            }
        } else {
            le1VarMo17810Q = this;
        }
        return (kzi) z0(this.s0.m12668a(imageView, this.q0), null, le1VarMo17810Q, ul6.m51708b());
    }

    public final boolean B0(le1 le1Var, wle wleVar) {
        return !le1Var.m36998G() && wleVar.isComplete();
    }

    public yle C0(Drawable drawable) {
        return L0(drawable).n0(qme.n0(qt5.f42383b));
    }

    public yle D0(Uri uri) {
        return L0(uri);
    }

    public yle E0(Integer num) {
        return L0(num).n0(qme.o0(lf0.m37055c(this.o0)));
    }

    public yle F0(Object obj) {
        return L0(obj);
    }

    public yle I0(String str) {
        return L0(str);
    }

    public yle J0(URL url) {
        return L0(url);
    }

    public final yle L0(Object obj) {
        if (m36997F()) {
            return clone().L0(obj);
        }
        this.u0 = obj;
        this.A0 = true;
        return (yle) m37010Z();
    }

    public final wle M0(Object obj, pjg pjgVar, gme gmeVar, le1 le1Var, bme bmeVar, ovh ovhVar, gid gidVar, int i, int i2, Executor executor) {
        Context context = this.o0;
        C10726c c10726c = this.s0;
        return puf.m44216x(context, c10726c, obj, this.u0, this.q0, le1Var, i, i2, gidVar, pjgVar, gmeVar, this.v0, bmeVar, c10726c.m12673f(), ovhVar.m42724b(), executor);
    }

    public yle N0(ovh ovhVar) {
        if (m36997F()) {
            return clone().N0(ovhVar);
        }
        this.t0 = (ovh) bgd.m18886d(ovhVar);
        this.z0 = false;
        return (yle) m37010Z();
    }

    @Override // p001o.le1
    public boolean equals(Object obj) {
        if (!(obj instanceof yle)) {
            return false;
        }
        yle yleVar = (yle) obj;
        return super.equals(yleVar) && Objects.equals(this.q0, yleVar.q0) && this.t0.equals(yleVar.t0) && Objects.equals(this.u0, yleVar.u0) && Objects.equals(this.v0, yleVar.v0) && Objects.equals(this.w0, yleVar.w0) && Objects.equals(this.x0, yleVar.x0) && Objects.equals(this.y0, yleVar.y0) && this.z0 == yleVar.z0 && this.A0 == yleVar.A0;
    }

    @Override // p001o.le1
    public int hashCode() {
        return uqi.m51934o(this.A0, uqi.m51934o(this.z0, uqi.m51933n(this.y0, uqi.m51933n(this.x0, uqi.m51933n(this.w0, uqi.m51933n(this.v0, uqi.m51933n(this.u0, uqi.m51933n(this.t0, uqi.m51933n(this.q0, super.hashCode())))))))));
    }

    public yle m0(gme gmeVar) {
        if (m36997F()) {
            return clone().m0(gmeVar);
        }
        if (gmeVar != null) {
            if (this.v0 == null) {
                this.v0 = new ArrayList();
            }
            this.v0.add(gmeVar);
        }
        return (yle) m37010Z();
    }

    @Override // p001o.le1
    public yle n0(le1 le1Var) {
        bgd.m18886d(le1Var);
        return (yle) super.n0(le1Var);
    }

    public final wle o0(pjg pjgVar, gme gmeVar, le1 le1Var, Executor executor) {
        return p0(new Object(), pjgVar, gmeVar, null, this.t0, le1Var.m37023x(), le1Var.m37020u(), le1Var.m37019t(), le1Var, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wle p0(Object obj, pjg pjgVar, gme gmeVar, bme bmeVar, ovh ovhVar, gid gidVar, int i, int i2, le1 le1Var, Executor executor) {
        bme bmeVar2;
        bme rj6Var;
        if (this.x0 != null) {
            rj6Var = new rj6(obj, bmeVar);
            bmeVar2 = rj6Var;
        } else {
            bmeVar2 = null;
            rj6Var = bmeVar;
        }
        wle wleVarQ0 = q0(obj, pjgVar, gmeVar, rj6Var, ovhVar, gidVar, i, i2, le1Var, executor);
        if (bmeVar2 == null) {
            return wleVarQ0;
        }
        int iM37020u = this.x0.m37020u();
        int iM37019t = this.x0.m37019t();
        if (uqi.m51938s(i, i2) && !this.x0.m37005O()) {
            iM37020u = le1Var.m37020u();
            iM37019t = le1Var.m37019t();
        }
        yle yleVar = this.x0;
        rj6 rj6Var2 = bmeVar2;
        rj6Var2.m46863o(wleVarQ0, yleVar.p0(obj, pjgVar, gmeVar, rj6Var2, yleVar.t0, yleVar.m37023x(), iM37020u, iM37019t, this.x0, executor));
        return rj6Var2;
    }

    public final wle q0(Object obj, pjg pjgVar, gme gmeVar, bme bmeVar, ovh ovhVar, gid gidVar, int i, int i2, le1 le1Var, Executor executor) {
        yle yleVar = this.w0;
        if (yleVar == null) {
            if (this.y0 == null) {
                return M0(obj, pjgVar, gmeVar, le1Var, bmeVar, ovhVar, gidVar, i, i2, executor);
            }
            plh plhVar = new plh(obj, bmeVar);
            plhVar.m43860n(M0(obj, pjgVar, gmeVar, le1Var, plhVar, ovhVar, gidVar, i, i2, executor), M0(obj, pjgVar, gmeVar, le1Var.r0().c0(this.y0.floatValue()), plhVar, ovhVar, s0(gidVar), i, i2, executor));
            return plhVar;
        }
        if (this.B0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        ovh ovhVar2 = yleVar.z0 ? ovhVar : yleVar.t0;
        gid gidVarM37023x = yleVar.m36999H() ? this.w0.m37023x() : s0(gidVar);
        int iM37020u = this.w0.m37020u();
        int iM37019t = this.w0.m37019t();
        if (uqi.m51938s(i, i2) && !this.w0.m37005O()) {
            iM37020u = le1Var.m37020u();
            iM37019t = le1Var.m37019t();
        }
        plh plhVar2 = new plh(obj, bmeVar);
        wle wleVarM0 = M0(obj, pjgVar, gmeVar, le1Var, plhVar2, ovhVar, gidVar, i, i2, executor);
        this.B0 = true;
        yle yleVar2 = this.w0;
        wle wleVarP0 = yleVar2.p0(obj, pjgVar, gmeVar, plhVar2, ovhVar2, gidVarM37023x, iM37020u, iM37019t, yleVar2, executor);
        this.B0 = false;
        plhVar2.m43860n(wleVarM0, wleVarP0);
        return plhVar2;
    }

    @Override // p001o.le1
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yle r0() {
        yle yleVar = (yle) super.r0();
        yleVar.t0 = yleVar.t0.clone();
        if (yleVar.v0 != null) {
            yleVar.v0 = new ArrayList(yleVar.v0);
        }
        yle yleVar2 = yleVar.w0;
        if (yleVar2 != null) {
            yleVar.w0 = yleVar2.clone();
        }
        yle yleVar3 = yleVar.x0;
        if (yleVar3 != null) {
            yleVar.x0 = yleVar3.clone();
        }
        return yleVar;
    }

    public final gid s0(gid gidVar) {
        int i = C18428a.f55683b[gidVar.ordinal()];
        if (i == 1) {
            return gid.NORMAL;
        }
        if (i == 2) {
            return gid.HIGH;
        }
        if (i == 3 || i == 4) {
            return gid.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m37023x());
    }

    public final void t0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
            m0(null);
        }
    }

    public pjg w0(pjg pjgVar) {
        return x0(pjgVar, null, ul6.m51708b());
    }

    public pjg x0(pjg pjgVar, gme gmeVar, Executor executor) {
        return z0(pjgVar, gmeVar, this, executor);
    }

    public final pjg z0(pjg pjgVar, gme gmeVar, le1 le1Var, Executor executor) {
        bgd.m18886d(pjgVar);
        if (!this.A0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        wle wleVarO0 = o0(pjgVar, gmeVar, le1Var, executor);
        wle wleVarMo36380a = pjgVar.mo36380a();
        if (wleVarO0.mo43854d(wleVarMo36380a) && !B0(le1Var, wleVarMo36380a)) {
            if (!((wle) bgd.m18886d(wleVarMo36380a)).isRunning()) {
                wleVarMo36380a.mo43856j();
            }
            return pjgVar;
        }
        this.p0.m30820l(pjgVar);
        pjgVar.mo36382d(wleVarO0);
        this.p0.m30833z(pjgVar, wleVarO0);
        return pjgVar;
    }
}
