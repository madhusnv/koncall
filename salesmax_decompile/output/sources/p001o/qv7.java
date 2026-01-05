package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.weg;

/* loaded from: classes2.dex */
public abstract class qv7 {
    /* renamed from: a */
    public static List m45865a(int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m45870f());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(m45872h());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(m45869e());
        }
        if (z) {
            arrayList.addAll(m45874j());
        }
        if (z2 && i == 0) {
            arrayList.addAll(m45867c());
        }
        if (i == 3) {
            arrayList.addAll(m45871g());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List m45866b() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.PREVIEW;
        vegVar3.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        vegVar3.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.RECORD;
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a3));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a3));
        vegVar7.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a3));
        vegVar8.m52678a(weg.m54274a(enumC17833b3, enumC17832a3));
        arrayList.add(vegVar8);
        return arrayList;
    }

    /* renamed from: c */
    public static List m45867c() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.PREVIEW;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar3);
        return arrayList;
    }

    /* renamed from: d */
    public static List m45868d() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.YUV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.s1440p;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.PRIV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        vegVar3.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.s720p;
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar4.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar7.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar8);
        veg vegVar9 = new veg();
        vegVar9.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar9.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar9);
        return arrayList;
    }

    /* renamed from: e */
    public static List m45869e() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.PREVIEW;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar4.m52678a(weg.m54274a(weg.EnumC17833b.JPEG, enumC17832a2));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.VGA;
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        vegVar5.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar6);
        return arrayList;
    }

    /* renamed from: f */
    public static List m45870f() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.JPEG;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.YUV;
        vegVar3.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.PREVIEW;
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar7.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar8);
        return arrayList;
    }

    /* renamed from: g */
    public static List m45871g() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.PREVIEW;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.VGA;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.RAW;
        vegVar.m52678a(weg.m54274a(enumC17833b3, enumC17832a3));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        vegVar2.m52678a(weg.m54274a(weg.EnumC17833b.JPEG, enumC17832a3));
        vegVar2.m52678a(weg.m54274a(enumC17833b3, enumC17832a3));
        arrayList.add(vegVar2);
        return arrayList;
    }

    /* renamed from: h */
    public static List m45872h() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.PREVIEW;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.RECORD;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a2));
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        vegVar4.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar6.m52678a(weg.m54274a(enumC17833b3, weg.EnumC17832a.MAXIMUM));
        arrayList.add(vegVar6);
        return arrayList;
    }

    /* renamed from: i */
    public static List m45873i() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.s1440p;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        vegVar3.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.MAXIMUM;
        vegVar3.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar4.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.PREVIEW;
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a3));
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar8);
        veg vegVar9 = new veg();
        vegVar9.m52678a(weg.m54274a(enumC17833b, enumC17832a3));
        vegVar9.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar9);
        veg vegVar10 = new veg();
        vegVar10.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        vegVar10.m52678a(weg.m54274a(enumC17833b2, enumC17832a));
        arrayList.add(vegVar10);
        return arrayList;
    }

    /* renamed from: j */
    public static List m45874j() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.RAW;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.PREVIEW;
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.YUV;
        vegVar3.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar3.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar6.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar6.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        vegVar7.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        weg.EnumC17833b enumC17833b4 = weg.EnumC17833b.JPEG;
        vegVar7.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b3, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar8);
        return arrayList;
    }

    /* renamed from: k */
    public static List m45875k() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.s1440p;
        vegVar.m52678a(weg.m54275b(enumC17833b, enumC17832a, 4L));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.YUV;
        vegVar2.m52678a(weg.m54275b(enumC17833b2, enumC17832a, 4L));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.RECORD;
        vegVar3.m52678a(weg.m54275b(enumC17833b, enumC17832a2, 3L));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54275b(enumC17833b2, enumC17832a2, 3L));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.MAXIMUM;
        vegVar5.m52678a(weg.m54275b(enumC17833b3, enumC17832a3, 2L));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54275b(enumC17833b2, enumC17832a3, 2L));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        weg.EnumC17832a enumC17832a4 = weg.EnumC17832a.PREVIEW;
        vegVar7.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar7.m52678a(weg.m54275b(enumC17833b3, enumC17832a3, 2L));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar8.m52678a(weg.m54275b(enumC17833b2, enumC17832a3, 2L));
        arrayList.add(vegVar8);
        veg vegVar9 = new veg();
        vegVar9.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar9.m52678a(weg.m54275b(enumC17833b, enumC17832a2, 3L));
        arrayList.add(vegVar9);
        veg vegVar10 = new veg();
        vegVar10.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar10.m52678a(weg.m54275b(enumC17833b2, enumC17832a2, 3L));
        arrayList.add(vegVar10);
        veg vegVar11 = new veg();
        vegVar11.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar11.m52678a(weg.m54275b(enumC17833b2, enumC17832a4, 1L));
        arrayList.add(vegVar11);
        veg vegVar12 = new veg();
        vegVar12.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar12.m52678a(weg.m54275b(enumC17833b, enumC17832a2, 3L));
        vegVar12.m52678a(weg.m54275b(enumC17833b3, enumC17832a2, 2L));
        arrayList.add(vegVar12);
        veg vegVar13 = new veg();
        vegVar13.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar13.m52678a(weg.m54275b(enumC17833b2, enumC17832a2, 3L));
        vegVar13.m52678a(weg.m54275b(enumC17833b3, enumC17832a2, 2L));
        arrayList.add(vegVar13);
        veg vegVar14 = new veg();
        vegVar14.m52678a(weg.m54275b(enumC17833b, enumC17832a4, 1L));
        vegVar14.m52678a(weg.m54275b(enumC17833b2, enumC17832a4, 1L));
        vegVar14.m52678a(weg.m54275b(enumC17833b3, enumC17832a3, 2L));
        arrayList.add(vegVar14);
        return arrayList;
    }

    /* renamed from: l */
    public static List m45876l() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.JPEG_R;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        vegVar2.m52678a(weg.m54274a(weg.EnumC17833b.PRIV, weg.EnumC17832a.PREVIEW));
        vegVar2.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        arrayList.add(vegVar2);
        return arrayList;
    }

    /* renamed from: m */
    public static List m45877m() {
        ArrayList arrayList = new ArrayList();
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.YUV;
        weg.EnumC17832a enumC17832a = weg.EnumC17832a.ULTRA_MAXIMUM;
        vegVar.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        weg.EnumC17833b enumC17833b2 = weg.EnumC17833b.PRIV;
        weg.EnumC17832a enumC17832a2 = weg.EnumC17832a.PREVIEW;
        vegVar.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        weg.EnumC17832a enumC17832a3 = weg.EnumC17832a.RECORD;
        vegVar.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        arrayList.add(vegVar);
        veg vegVar2 = new veg();
        weg.EnumC17833b enumC17833b3 = weg.EnumC17833b.JPEG;
        vegVar2.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar2.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        arrayList.add(vegVar2);
        veg vegVar3 = new veg();
        weg.EnumC17833b enumC17833b4 = weg.EnumC17833b.RAW;
        vegVar3.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar3.m52678a(weg.m54274a(enumC17833b2, enumC17832a3));
        arrayList.add(vegVar3);
        veg vegVar4 = new veg();
        vegVar4.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar4.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        weg.EnumC17832a enumC17832a4 = weg.EnumC17832a.MAXIMUM;
        vegVar4.m52678a(weg.m54274a(enumC17833b3, enumC17832a4));
        arrayList.add(vegVar4);
        veg vegVar5 = new veg();
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        vegVar5.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar5.m52678a(weg.m54274a(enumC17833b3, enumC17832a4));
        arrayList.add(vegVar5);
        veg vegVar6 = new veg();
        vegVar6.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar6.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar6.m52678a(weg.m54274a(enumC17833b3, enumC17832a4));
        arrayList.add(vegVar6);
        veg vegVar7 = new veg();
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar7.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar7.m52678a(weg.m54274a(enumC17833b, enumC17832a4));
        arrayList.add(vegVar7);
        veg vegVar8 = new veg();
        vegVar8.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        vegVar8.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar8.m52678a(weg.m54274a(enumC17833b, enumC17832a4));
        arrayList.add(vegVar8);
        veg vegVar9 = new veg();
        vegVar9.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar9.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar9.m52678a(weg.m54274a(enumC17833b, enumC17832a4));
        arrayList.add(vegVar9);
        veg vegVar10 = new veg();
        vegVar10.m52678a(weg.m54274a(enumC17833b, enumC17832a));
        vegVar10.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar10.m52678a(weg.m54274a(enumC17833b4, enumC17832a4));
        arrayList.add(vegVar10);
        veg vegVar11 = new veg();
        vegVar11.m52678a(weg.m54274a(enumC17833b3, enumC17832a));
        vegVar11.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar11.m52678a(weg.m54274a(enumC17833b4, enumC17832a4));
        arrayList.add(vegVar11);
        veg vegVar12 = new veg();
        vegVar12.m52678a(weg.m54274a(enumC17833b4, enumC17832a));
        vegVar12.m52678a(weg.m54274a(enumC17833b2, enumC17832a2));
        vegVar12.m52678a(weg.m54274a(enumC17833b4, enumC17832a4));
        arrayList.add(vegVar12);
        return arrayList;
    }
}
