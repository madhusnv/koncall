package g4;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.x */
/* loaded from: classes.dex */
public final class C2508x {

    /* renamed from: b */
    public static final C2508x f13730b = new C2508x(false);

    /* renamed from: a */
    public final boolean f13731a;

    public C2508x() {
        this.f13731a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2508x) {
            return this.f13731a == ((C2508x) obj).f13731a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f13731a) * 31);
    }

    public final String toString() {
        return AbstractC5601a.m11242m(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f13731a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public C2508x(boolean z6) {
        this.f13731a = z6;
    }
}
