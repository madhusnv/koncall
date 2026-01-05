package p001o;

import p001o.en0;

/* loaded from: classes3.dex */
public final class okj extends en0.AbstractC13235a {

    /* renamed from: a */
    public int f38518a;

    /* renamed from: b */
    public boolean f38519b;

    /* renamed from: c */
    public byte f38520c;

    @Override // p001o.en0.AbstractC13235a
    /* renamed from: a */
    public final en0 mo25346a() {
        if (this.f38520c == 3) {
            return new skj(this.f38518a, this.f38519b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f38520c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f38520c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // p001o.en0.AbstractC13235a
    /* renamed from: b */
    public final en0.AbstractC13235a mo25347b(boolean z) {
        this.f38519b = z;
        this.f38520c = (byte) (this.f38520c | 2);
        return this;
    }

    /* renamed from: c */
    public final en0.AbstractC13235a m42369c(int i) {
        this.f38518a = i;
        this.f38520c = (byte) (this.f38520c | 1);
        return this;
    }
}
