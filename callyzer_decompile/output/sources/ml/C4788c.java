package ml;

import com.sun.mail.util.AbstractC1452a;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ml.c */
/* loaded from: classes.dex */
public final class C4788c {

    /* renamed from: e */
    public static final C4788c f23824e;

    /* renamed from: f */
    public static final C4788c f23825f;

    /* renamed from: a */
    public final EnumC4789d f23826a;

    /* renamed from: b */
    public final int f23827b;

    /* renamed from: c */
    public final EnumC4786a f23828c;

    /* renamed from: d */
    public final /* synthetic */ int f23829d;

    static {
        HashMap map = new HashMap();
        EnumC4789d enumC4789d = EnumC4789d.UNIVERSAL;
        EnumC4786a enumC4786a = EnumC4786a.PRIMITIVE;
        C4788c c4788c = new C4788c(enumC4789d, 1, enumC4786a, 0);
        C4788c c4788c2 = new C4788c(enumC4789d, 2, enumC4786a, 1);
        f23824e = c4788c2;
        EnumC4786a enumC4786a2 = EnumC4786a.CONSTRUCTED;
        EnumSet.of(enumC4786a, enumC4786a2);
        int i10 = 0;
        C4788c c4788c3 = new C4788c(enumC4789d, 3, enumC4786a, i10, 2);
        C4788c c4788c4 = new C4788c(enumC4789d, 4, EnumSet.of(enumC4786a, enumC4786a2).contains(enumC4786a) ? enumC4786a : enumC4786a2, i10, 3);
        C4788c c4788c5 = new C4788c(enumC4789d, 5, enumC4786a, 4);
        C4788c c4788c6 = new C4788c(enumC4789d, 6, enumC4786a, 5);
        C4788c c4788c7 = new C4788c(enumC4789d, 10, enumC4786a, 6);
        C4788c c4788c8 = new C4788c(enumC4789d, 17, enumC4786a2, 7);
        C4788c c4788c9 = new C4788c(enumC4789d, 16, enumC4786a2, 8);
        f23825f = c4788c9;
        map.put(1, c4788c);
        map.put(2, c4788c2);
        map.put(3, c4788c3);
        map.put(4, c4788c4);
        map.put(5, c4788c5);
        map.put(6, c4788c6);
        map.put(10, c4788c7);
        map.put(17, c4788c8);
        map.put(16, c4788c9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4788c(EnumC4789d enumC4789d, int i10, EnumC4786a enumC4786a, int i11, int i12) {
        this(enumC4789d, i10, enumC4786a, i11, false);
        this.f23829d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4788c c4788c = (C4788c) obj;
        return this.f23827b == c4788c.f23827b && this.f23826a == c4788c.f23826a && this.f23828c == c4788c.f23828c;
    }

    public final int hashCode() {
        return Objects.hash(this.f23826a, Integer.valueOf(this.f23827b), this.f23828c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ASN1Tag[");
        sb2.append(this.f23826a);
        sb2.append(",");
        sb2.append(this.f23828c);
        sb2.append(",");
        return AbstractC1452a.m4563j(sb2, this.f23827b, ']');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4788c(EnumC4789d enumC4789d, int i10, EnumC4786a enumC4786a, int i11) {
        this(enumC4789d, i10, enumC4786a, 0, false);
        this.f23829d = i11;
        EnumSet.of(enumC4786a);
    }

    public C4788c(EnumC4789d enumC4789d, int i10, EnumC4786a enumC4786a, int i11, boolean z6) {
        this.f23826a = enumC4789d;
        this.f23827b = i10;
        this.f23828c = enumC4786a;
    }
}
