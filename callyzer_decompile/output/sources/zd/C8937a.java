package zd;

import al.C0182j;
import b00.a0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.a */
/* loaded from: classes.dex */
public final class C8937a {

    /* renamed from: a */
    public final String f42913a;

    /* renamed from: b */
    public final long[] f42914b = new long[2];

    /* renamed from: c */
    public final ArrayList f42915c = new ArrayList(2);

    /* renamed from: d */
    public final ArrayList f42916d = new ArrayList(2);

    /* renamed from: e */
    public boolean f42917e;

    /* renamed from: f */
    public boolean f42918f;

    /* renamed from: g */
    public C0182j f42919g;

    /* renamed from: h */
    public int f42920h;

    /* renamed from: i */
    public final /* synthetic */ C8940d f42921i;

    public C8937a(C8940d c8940d, String str) {
        this.f42921i = c8940d;
        this.f42913a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f42915c.add(this.f42921i.f42927a.m1519d(sb2.toString()));
            sb2.append(".tmp");
            this.f42916d.add(this.f42921i.f42927a.m1519d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* renamed from: a */
    public final C8938b m16409a() {
        if (!this.f42917e || this.f42919g != null || this.f42918f) {
            return null;
        }
        ArrayList arrayList = this.f42915c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            C8940d c8940d = this.f42921i;
            if (i10 >= size) {
                this.f42920h++;
                return new C8938b(c8940d, this);
            }
            if (!c8940d.f42942r.m1623z((a0) arrayList.get(i10))) {
                try {
                    c8940d.m16415P(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
