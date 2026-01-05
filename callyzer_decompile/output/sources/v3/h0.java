package v3;

import c3.C0847b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.xe;
import rw.AbstractC6674x;
import s1.C6725t;
import t3.AbstractC7016c;
import t3.C7027n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public final t3.w0 f36878a;

    /* renamed from: c */
    public boolean f36880c;

    /* renamed from: d */
    public boolean f36881d;

    /* renamed from: e */
    public boolean f36882e;

    /* renamed from: f */
    public boolean f36883f;

    /* renamed from: g */
    public boolean f36884g;

    /* renamed from: h */
    public InterfaceC7629a f36885h;

    /* renamed from: j */
    public final /* synthetic */ int f36887j;

    /* renamed from: b */
    public boolean f36879b = true;

    /* renamed from: i */
    public final HashMap f36886i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public h0(InterfaceC7629a interfaceC7629a, int i10) {
        this.f36887j = i10;
        this.f36878a = (t3.w0) interfaceC7629a;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ex.e, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v6, types: [t3.w0, v3.a] */
    /* renamed from: a */
    public static final void m14614a(h0 h0Var, C7027n c7027n, int i10, h1 h1Var) {
        HashMap map = h0Var.f36886i;
        float f6 = i10;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f6) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f6) & 4294967295L;
        while (true) {
            long jM11047d = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (h0Var.f36887j) {
                    case 0:
                        o1 o1Var = h1Var.f36901K;
                        if (o1Var != null) {
                            jM11047d = o1Var.mo14654j(false, jM11047d);
                        }
                        jM11047d = xe.m11047d(jM11047d, h1Var.f36913z);
                        break;
                    default:
                        o0 o0VarR0 = h1Var.R0();
                        AbstractC4154l.m8920c(o0VarR0);
                        long j6 = o0VarR0.f36967n;
                        jM11047d = C0847b.m2276g((Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32), jM11047d);
                        break;
                }
                h1Var = h1Var.f36904p;
                AbstractC4154l.m8920c(h1Var);
                if (h1Var.equals(h0Var.f36878a.mo14526j())) {
                    int iRound = Math.round(c7027n instanceof C7027n ? Float.intBitsToFloat((int) (jM11047d & 4294967295L)) : Float.intBitsToFloat((int) (jM11047d >> 32)));
                    if (map.containsKey(c7027n)) {
                        int iIntValue = ((Number) AbstractC6674x.m12774b(map, c7027n)).intValue();
                        C7027n c7027n2 = AbstractC7016c.f33966a;
                        iRound = ((Number) c7027n.f34014a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c7027n, Integer.valueOf(iRound));
                    return;
                }
            } while (!h0Var.m14615b(h1Var).containsKey(c7027n));
            float fM14616c = h0Var.m14616c(h1Var, c7027n);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM14616c);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM14616c);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* renamed from: b */
    public final Map m14615b(h1 h1Var) {
        switch (this.f36887j) {
            case 0:
                return h1Var.C0().mo12109c();
            default:
                o0 o0VarR0 = h1Var.R0();
                AbstractC4154l.m8920c(o0VarR0);
                return o0VarR0.C0().mo12109c();
        }
    }

    /* renamed from: c */
    public final int m14616c(h1 h1Var, C7027n c7027n) {
        switch (this.f36887j) {
            case 0:
                return h1Var.d0(c7027n);
            default:
                o0 o0VarR0 = h1Var.R0();
                AbstractC4154l.m8920c(o0VarR0);
                return o0VarR0.d0(c7027n);
        }
    }

    /* renamed from: d */
    public final boolean m14617d() {
        return this.f36880c || this.f36882e || this.f36883f || this.f36884g;
    }

    /* renamed from: e */
    public final boolean m14618e() {
        m14621h();
        return this.f36885h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t3.w0, v3.a] */
    /* renamed from: f */
    public final void m14619f() {
        this.f36879b = true;
        ?? r02 = this.f36878a;
        InterfaceC7629a interfaceC7629aMo14527r = r02.mo14527r();
        if (interfaceC7629aMo14527r == null) {
            return;
        }
        if (this.f36880c) {
            interfaceC7629aMo14527r.mo14523W();
        } else if (this.f36882e || this.f36881d) {
            interfaceC7629aMo14527r.requestLayout();
        }
        if (this.f36883f) {
            r02.mo14523W();
        }
        if (this.f36884g) {
            r02.requestLayout();
        }
        interfaceC7629aMo14527r.mo14524c().m14619f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t3.w0, v3.a] */
    /* renamed from: g */
    public final void m14620g() {
        HashMap map = this.f36886i;
        map.clear();
        C6725t c6725t = new C6725t(7, this);
        ?? r22 = this.f36878a;
        r22.mo14525h(c6725t);
        map.putAll(m14615b(r22.mo14526j()));
        this.f36879b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [t3.w0, v3.a] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14621h() {
        /*
            r2 = this;
            boolean r0 = r2.m14617d()
            t3.w0 r1 = r2.f36878a
            if (r0 == 0) goto L9
            goto L51
        L9:
            v3.a r0 = r1.mo14527r()
            if (r0 != 0) goto L10
            goto L53
        L10:
            v3.h0 r0 = r0.mo14524c()
            v3.a r1 = r0.f36885h
            if (r1 == 0) goto L23
            v3.h0 r0 = r1.mo14524c()
            boolean r0 = r0.m14617d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            v3.a r0 = r2.f36885h
            if (r0 == 0) goto L53
            v3.h0 r1 = r0.mo14524c()
            boolean r1 = r1.m14617d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            v3.a r1 = r0.mo14527r()
            if (r1 == 0) goto L41
            v3.h0 r1 = r1.mo14524c()
            if (r1 == 0) goto L41
            r1.m14621h()
        L41:
            v3.a r0 = r0.mo14527r()
            if (r0 == 0) goto L50
            v3.h0 r0 = r0.mo14524c()
            if (r0 == 0) goto L50
            v3.a r1 = r0.f36885h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f36885h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h0.m14621h():void");
    }
}
