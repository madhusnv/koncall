package jc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.s */
/* loaded from: classes.dex */
public final class C3743s extends AbstractC3745u {

    /* renamed from: a */
    public static final C3743s f19596a = new C3743s();

    @Override // jc.AbstractC3745u
    public final boolean equals(Object obj) {
        Long contentLength;
        return (obj instanceof AbstractC3745u) && (contentLength = ((AbstractC3745u) obj).getContentLength()) != null && contentLength.longValue() == 0;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return 0L;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        return false;
    }
}
