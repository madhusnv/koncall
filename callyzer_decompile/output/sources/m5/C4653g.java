package m5;

import android.view.ViewGroup;
import k5.C4013h;
import k5.C4016k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.g */
/* loaded from: classes.dex */
public final class C4653g extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public float f22905A;

    /* renamed from: B */
    public String f22906B;

    /* renamed from: C */
    public int f22907C;

    /* renamed from: D */
    public float f22908D;

    /* renamed from: E */
    public float f22909E;

    /* renamed from: F */
    public int f22910F;

    /* renamed from: G */
    public int f22911G;

    /* renamed from: H */
    public int f22912H;

    /* renamed from: I */
    public int f22913I;

    /* renamed from: J */
    public int f22914J;

    /* renamed from: K */
    public int f22915K;

    /* renamed from: L */
    public int f22916L;

    /* renamed from: M */
    public int f22917M;

    /* renamed from: N */
    public float f22918N;

    /* renamed from: O */
    public float f22919O;

    /* renamed from: P */
    public int f22920P;

    /* renamed from: Q */
    public int f22921Q;

    /* renamed from: R */
    public int f22922R;

    /* renamed from: S */
    public boolean f22923S;

    /* renamed from: T */
    public boolean f22924T;

    /* renamed from: U */
    public String f22925U;

    /* renamed from: V */
    public boolean f22926V;

    /* renamed from: W */
    public boolean f22927W;

    /* renamed from: X */
    public boolean f22928X;

    /* renamed from: Y */
    public boolean f22929Y;

    /* renamed from: Z */
    public boolean f22930Z;

    /* renamed from: a */
    public int f22931a;

    /* renamed from: a0, reason: collision with root package name */
    public int f44409a0;

    /* renamed from: b */
    public int f22932b;

    /* renamed from: b0, reason: collision with root package name */
    public int f44410b0;

    /* renamed from: c */
    public float f22933c;

    /* renamed from: c0, reason: collision with root package name */
    public int f44411c0;

    /* renamed from: d */
    public int f22934d;

    /* renamed from: d0, reason: collision with root package name */
    public int f44412d0;

    /* renamed from: e */
    public int f22935e;

    /* renamed from: e0, reason: collision with root package name */
    public int f44413e0;

    /* renamed from: f */
    public int f22936f;

    /* renamed from: f0, reason: collision with root package name */
    public int f44414f0;

    /* renamed from: g */
    public int f22937g;

    /* renamed from: g0, reason: collision with root package name */
    public float f44415g0;

    /* renamed from: h */
    public int f22938h;

    /* renamed from: h0, reason: collision with root package name */
    public int f44416h0;

    /* renamed from: i */
    public int f22939i;

    /* renamed from: i0, reason: collision with root package name */
    public int f44417i0;

    /* renamed from: j */
    public int f22940j;

    /* renamed from: j0, reason: collision with root package name */
    public float f44418j0;

    /* renamed from: k */
    public int f22941k;

    /* renamed from: k0, reason: collision with root package name */
    public C4013h f44419k0;

    /* renamed from: l */
    public int f22942l;

    /* renamed from: m */
    public int f22943m;

    /* renamed from: n */
    public int f22944n;

    /* renamed from: o */
    public float f22945o;

    /* renamed from: p */
    public int f22946p;

    /* renamed from: q */
    public int f22947q;

    /* renamed from: r */
    public int f22948r;

    /* renamed from: s */
    public int f22949s;

    /* renamed from: t */
    public int f22950t;

    /* renamed from: u */
    public int f22951u;

    /* renamed from: v */
    public int f22952v;

    /* renamed from: w */
    public int f22953w;

    /* renamed from: x */
    public int f22954x;

    /* renamed from: y */
    public int f22955y;

    /* renamed from: z */
    public float f22956z;

    /* renamed from: a */
    public final void m9533a() {
        this.f22929Y = false;
        this.f22926V = true;
        this.f22927W = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.f22923S) {
            this.f22926V = false;
            if (this.f22912H == 0) {
                this.f22912H = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.f22924T) {
            this.f22927W = false;
            if (this.f22913I == 0) {
                this.f22913I = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f22926V = false;
            if (i10 == 0 && this.f22912H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f22923S = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f22927W = false;
            if (i11 == 0 && this.f22913I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f22924T = true;
            }
        }
        if (this.f22933c == -1.0f && this.f22931a == -1 && this.f22932b == -1) {
            return;
        }
        this.f22929Y = true;
        this.f22926V = true;
        this.f22927W = true;
        if (!(this.f44419k0 instanceof C4016k)) {
            this.f44419k0 = new C4016k();
        }
        ((C4016k) this.f44419k0).m8819y(this.f22922R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.C4653g.resolveLayoutDirection(int):void");
    }
}
