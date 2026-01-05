package wg;

import android.os.Parcel;
import ig.AbstractBinderC3252h;
import jg.AbstractC3762a;
import l0.RunnableC4307g;
import rf.BinderC6520y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8030c extends AbstractBinderC3252h {
    @Override // ig.AbstractBinderC3252h
    /* renamed from: O */
    public final boolean mo7586O(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                AbstractC3762a.m8286b(parcel);
                break;
            case 4:
                AbstractC3762a.m8286b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC3762a.m8286b(parcel);
                break;
            case 7:
                AbstractC3762a.m8286b(parcel);
                break;
            case 8:
                C8035h c8035h = (C8035h) AbstractC3762a.m8285a(parcel, C8035h.CREATOR);
                AbstractC3762a.m8286b(parcel);
                BinderC6520y binderC6520y = (BinderC6520y) this;
                binderC6520y.f31288g.post(new RunnableC4307g(10, binderC6520y, c8035h, false));
                break;
            case 9:
                AbstractC3762a.m8286b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
