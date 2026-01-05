package v4;

import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import c6.y1;
import c9.C0917l;
import og.xe;
import t3.c1;
import u5.C7340b;
import v3.C7649u;
import w4.C7921m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.b */
/* loaded from: classes.dex */
public final class C7656b extends AbstractC0315j {

    /* renamed from: c */
    public final /* synthetic */ int f37083c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f37084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7656b(ViewGroup viewGroup, int i10) {
        super(1);
        this.f37083c = i10;
        this.f37084d = viewGroup;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: g */
    public final y1 mo927g(y1 y1Var) {
        switch (this.f37083c) {
            case 0:
                return ((C7672r) this.f37084d).m14680o(y1Var);
            default:
                C7921m c7921m = (C7921m) this.f37084d;
                if (c7921m.f38107d) {
                    return y1Var;
                }
                View childAt = c7921m.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c7921m.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c7921m.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? y1Var : y1Var.f5541a.mo2478n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: h */
    public final C0917l mo928h(C0917l c0917l) {
        switch (this.f37083c) {
            case 0:
                C7649u c7649u = (C7649u) ((C7672r) this.f37084d).f37106C.f36832K.f22539c;
                if (!c7649u.f37016V.f37683p) {
                    return c0917l;
                }
                long jM11048e = xe.m11048e(c7649u.mo13299V(0L));
                int i10 = (int) (jM11048e >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jM11048e & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jMo13307v = c1.m13279h(c7649u).mo13307v();
                int i12 = (int) (jMo13307v >> 32);
                int i13 = (int) (jMo13307v & 4294967295L);
                long j6 = c7649u.f34032c;
                long jM11048e2 = xe.m11048e(c7649u.mo13299V((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (jM11048e2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jM11048e2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) {
                    return c0917l;
                }
                return new C0917l(2, AbstractC7663i.m14679m((C7340b) c0917l.f5594b, i10, i11, i14, i16), AbstractC7663i.m14679m((C7340b) c0917l.f5595c, i10, i11, i14, i16));
            default:
                C7921m c7921m = (C7921m) this.f37084d;
                if (c7921m.f38107d) {
                    return c0917l;
                }
                View childAt = c7921m.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c7921m.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c7921m.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c0917l;
                }
                C7340b c7340bM13736b = C7340b.m13736b(iMax, iMax2, iMax3, iMax4);
                int i17 = c7340bM13736b.f34957a;
                C7340b c7340b = (C7340b) c0917l.f5594b;
                int i18 = c7340bM13736b.f34958b;
                int i19 = c7340bM13736b.f34959c;
                int i20 = c7340bM13736b.f34960d;
                return new C0917l(2, y1.m2536b(c7340b, i17, i18, i19, i20), y1.m2536b((C7340b) c0917l.f5595c, i17, i18, i19, i20));
        }
    }
}
