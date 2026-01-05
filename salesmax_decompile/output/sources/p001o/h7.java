package p001o;

import kotlinx.coroutines.AbstractC11951a;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class h7 extends d79 implements n64, h84 {

    /* renamed from: c */
    public final q74 f26284c;

    public h7(q74 q74Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            o0((p69) q74Var.get(p69.f39399t));
        }
        this.f26284c = q74Var.plus(this);
    }

    @Override // p001o.d79
    public final void C0(Object obj) {
        if (!(obj instanceof lm3)) {
            U0(obj);
        } else {
            lm3 lm3Var = (lm3) obj;
            T0(lm3Var.f34036a, lm3Var.m37463a());
        }
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f26284c;
    }

    @Override // p001o.d79
    /* renamed from: P */
    public String mo22419P() {
        return o75.m41657a(this) + " was cancelled";
    }

    public void S0(Object obj) {
        mo17837z(obj);
    }

    public void T0(Throwable th, boolean z) {
    }

    public void U0(Object obj) {
    }

    public final void V0(l84 l84Var, Object obj, nl7 nl7Var) {
        l84Var.invoke(nl7Var, obj, this);
    }

    @Override // p001o.d79, p001o.p69
    /* renamed from: a */
    public boolean mo22428a() {
        return super.mo22428a();
    }

    @Override // p001o.n64
    public final q74 getContext() {
        return this.f26284c;
    }

    @Override // p001o.d79
    public final void n0(Throwable th) {
        AbstractC11951a.m16250a(this.f26284c, th);
    }

    @Override // p001o.n64
    public final void resumeWith(Object obj) {
        Object objW0 = w0(rm3.m46955b(obj));
        if (objW0 == e79.f21109b) {
            return;
        }
        S0(objW0);
    }

    @Override // p001o.d79
    public String x0() {
        String strM51078g = u74.m51078g(this.f26284c);
        if (strM51078g == null) {
            return super.x0();
        }
        return TokenParser.DQUOTE + strM51078g + "\":" + super.x0();
    }
}
