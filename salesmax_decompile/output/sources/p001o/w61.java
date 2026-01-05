package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.irb;

/* loaded from: classes2.dex */
public final class w61 {

    /* renamed from: a */
    public final List f51523a;

    /* renamed from: b */
    public final int f51524b;

    /* renamed from: c */
    public final int f51525c;

    /* renamed from: d */
    public final int f51526d;

    /* renamed from: e */
    public final int f51527e;

    /* renamed from: f */
    public final int f51528f;

    /* renamed from: g */
    public final int f51529g;

    /* renamed from: h */
    public final int f51530h;

    /* renamed from: i */
    public final int f51531i;

    /* renamed from: j */
    public final int f51532j;

    /* renamed from: k */
    public final float f51533k;

    /* renamed from: l */
    public final String f51534l;

    public w61(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f51523a = list;
        this.f51524b = i;
        this.f51525c = i2;
        this.f51526d = i3;
        this.f51527e = i4;
        this.f51528f = i5;
        this.f51529g = i6;
        this.f51530h = i7;
        this.f51531i = i8;
        this.f51532j = i9;
        this.f51533k = f;
        this.f51534l = str;
    }

    /* renamed from: a */
    public static byte[] m54000a(zwc zwcVar) {
        int iM60010N = zwcVar.m60010N();
        int iM60025f = zwcVar.m60025f();
        zwcVar.m60018V(iM60010N);
        return hf3.m30321d(zwcVar.m60024e(), iM60025f, iM60010N);
    }

    /* renamed from: b */
    public static w61 m54001b(zwc zwcVar) throws byc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String strM30318a;
        int i8;
        try {
            zwcVar.m60018V(4);
            int iM60004H = (zwcVar.m60004H() & 3) + 1;
            if (iM60004H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM60004H2 = zwcVar.m60004H() & 31;
            for (int i9 = 0; i9 < iM60004H2; i9++) {
                arrayList.add(m54000a(zwcVar));
            }
            int iM60004H3 = zwcVar.m60004H();
            for (int i10 = 0; i10 < iM60004H3; i10++) {
                arrayList.add(m54000a(zwcVar));
            }
            if (iM60004H2 > 0) {
                irb.C14356c c14356cM32623l = irb.m32623l((byte[]) arrayList.get(0), iM60004H, ((byte[]) arrayList.get(0)).length);
                int i11 = c14356cM32623l.f29142f;
                int i12 = c14356cM32623l.f29143g;
                int i13 = c14356cM32623l.f29145i + 8;
                int i14 = c14356cM32623l.f29146j + 8;
                int i15 = c14356cM32623l.f29153q;
                int i16 = c14356cM32623l.f29154r;
                int i17 = c14356cM32623l.f29155s;
                int i18 = c14356cM32623l.f29156t;
                float f2 = c14356cM32623l.f29144h;
                strM30318a = hf3.m30318a(c14356cM32623l.f29137a, c14356cM32623l.f29138b, c14356cM32623l.f29139c);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                strM30318a = null;
                i8 = 16;
            }
            return new w61(arrayList, iM60004H, i, i2, i3, i4, i5, i6, i7, i8, f, strM30318a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw byc.m19921a("Error parsing AVC config", e);
        }
    }
}
