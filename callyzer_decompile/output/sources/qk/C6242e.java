package qk;

import java.sql.Timestamp;
import java.util.Date;
import nk.AbstractC5084g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qk.e */
/* loaded from: classes.dex */
public final class C6242e extends AbstractC5084g {

    /* renamed from: c */
    public final /* synthetic */ int f30261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6242e(Class cls, int i10) {
        super(cls);
        this.f30261c = i10;
    }

    @Override // nk.AbstractC5084g
    /* renamed from: a */
    public final Date mo10016a(Date date) {
        switch (this.f30261c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
