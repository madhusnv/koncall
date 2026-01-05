package k5;

import j5.C3586c;
import j5.C3588e;
import j5.C3592i;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k5.k */
/* loaded from: classes.dex */
public final class C4016k extends C4013h {

    /* renamed from: d0, reason: collision with root package name */
    public float f44404d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f44405e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f44406f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public C4010e f44407g0 = this.f20783y;

    /* renamed from: h0, reason: collision with root package name */
    public int f44408h0 = 0;

    public C4016k() {
        this.f20739G.clear();
        this.f20739G.add(this.f44407g0);
        int length = this.f20738F.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f20738F[i10] = this.f44407g0;
        }
    }

    @Override // k5.C4013h
    /* renamed from: a */
    public final void mo8785a(C3588e c3588e) {
        C4014i c4014i = (C4014i) this.f20742J;
        if (c4014i == null) {
            return;
        }
        C4010e c4010eMo8795e = c4014i.mo8795e(EnumC4009d.LEFT);
        C4010e c4010eMo8795e2 = c4014i.mo8795e(EnumC4009d.RIGHT);
        C4013h c4013h = this.f20742J;
        boolean z6 = c4013h != null && c4013h.f20741I[0] == EnumC4012g.WRAP_CONTENT;
        if (this.f44408h0 == 0) {
            c4010eMo8795e = c4014i.mo8795e(EnumC4009d.TOP);
            c4010eMo8795e2 = c4014i.mo8795e(EnumC4009d.BOTTOM);
            C4013h c4013h2 = this.f20742J;
            z6 = c4013h2 != null && c4013h2.f20741I[1] == EnumC4012g.WRAP_CONTENT;
        }
        if (this.f44405e0 != -1) {
            C3592i c3592iM8141j = c3588e.m8141j(this.f44407g0);
            c3588e.m8136e(c3592iM8141j, c3588e.m8141j(c4010eMo8795e), this.f44405e0, 8);
            if (z6) {
                c3588e.m8137f(c3588e.m8141j(c4010eMo8795e2), c3592iM8141j, 0, 5);
                return;
            }
            return;
        }
        if (this.f44406f0 != -1) {
            C3592i c3592iM8141j2 = c3588e.m8141j(this.f44407g0);
            C3592i c3592iM8141j3 = c3588e.m8141j(c4010eMo8795e2);
            c3588e.m8136e(c3592iM8141j2, c3592iM8141j3, -this.f44406f0, 8);
            if (z6) {
                c3588e.m8137f(c3592iM8141j2, c3588e.m8141j(c4010eMo8795e), 0, 5);
                c3588e.m8137f(c3592iM8141j3, c3592iM8141j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f44404d0 != -1.0f) {
            C3592i c3592iM8141j4 = c3588e.m8141j(this.f44407g0);
            C3592i c3592iM8141j5 = c3588e.m8141j(c4010eMo8795e2);
            float f6 = this.f44404d0;
            C3586c c3586cM8142k = c3588e.m8142k();
            c3586cM8142k.f19167d.mo8113f(c3592iM8141j4, -1.0f);
            c3586cM8142k.f19167d.mo8113f(c3592iM8141j5, f6);
            c3588e.m8134c(c3586cM8142k);
        }
    }

    @Override // k5.C4013h
    /* renamed from: b */
    public final boolean mo8786b() {
        return true;
    }

    @Override // k5.C4013h
    /* renamed from: e */
    public final C4010e mo8795e(EnumC4009d enumC4009d) {
        switch (AbstractC4015j.f20785a[enumC4009d.ordinal()]) {
            case 1:
            case 2:
                if (this.f44408h0 == 1) {
                    return this.f44407g0;
                }
                break;
            case 3:
            case 4:
                if (this.f44408h0 == 0) {
                    return this.f44407g0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC4009d.name());
    }

    @Override // k5.C4013h
    /* renamed from: x */
    public final void mo8814x(C3588e c3588e) {
        if (this.f20742J == null) {
            return;
        }
        C4010e c4010e = this.f44407g0;
        c3588e.getClass();
        int iM8131m = C3588e.m8131m(c4010e);
        if (this.f44408h0 == 1) {
            this.f20747O = iM8131m;
            this.f20748P = 0;
            m8809s(this.f20742J.m8797g());
            m8812v(0);
            return;
        }
        this.f20747O = 0;
        this.f20748P = iM8131m;
        m8812v(this.f20742J.m8800j());
        m8809s(0);
    }

    /* renamed from: y */
    public final void m8819y(int i10) {
        if (this.f44408h0 == i10) {
            return;
        }
        this.f44408h0 = i10;
        ArrayList arrayList = this.f20739G;
        arrayList.clear();
        if (this.f44408h0 == 1) {
            this.f44407g0 = this.f20782x;
        } else {
            this.f44407g0 = this.f20783y;
        }
        arrayList.add(this.f44407g0);
        C4010e[] c4010eArr = this.f20738F;
        int length = c4010eArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            c4010eArr[i11] = this.f44407g0;
        }
    }
}
