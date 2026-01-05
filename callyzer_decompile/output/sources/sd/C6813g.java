package sd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4261c;
import kx.C4265g;
import kx.C4266h;
import nx.AbstractC5185w;
import og.qe;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import pg.w9;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sd.g */
/* loaded from: classes.dex */
public final class C6813g implements InterfaceC6811e {

    /* renamed from: g */
    public static final C6813g f32357g;

    /* renamed from: h */
    public static final C6813g f32358h;

    /* renamed from: i */
    public static final C6813g f32359i;

    /* renamed from: j */
    public static final C6813g f32360j;

    /* renamed from: k */
    public static final C6813g f32361k;

    /* renamed from: l */
    public static final C6813g f32362l;

    /* renamed from: m */
    public static final C6813g f32363m;

    /* renamed from: n */
    public static final C6813g f32364n;

    /* renamed from: b */
    public final String f32365b;

    /* renamed from: c */
    public final Set f32366c;

    /* renamed from: d */
    public final Map f32367d = C6669s.f31944a;

    /* renamed from: e */
    public final LinkedHashMap f32368e;

    /* renamed from: f */
    public final LinkedHashMap f32369f;

    static {
        ArrayList arrayListM12754R;
        Iterable c4261c = new C4261c('A', Matrix.MATRIX_TYPE_ZERO);
        C4261c c4261c2 = new C4261c('a', 'z');
        if (c4261c instanceof Collection) {
            arrayListM12754R = AbstractC6663m.m12754R((Collection) c4261c, c4261c2);
        } else {
            ArrayList arrayList = new ArrayList();
            AbstractC6663m.m12765x(arrayList, c4261c);
            AbstractC6663m.m12765x(arrayList, c4261c2);
            arrayListM12754R = arrayList;
        }
        LinkedHashSet linkedHashSetM10858d = qe.m10858d(qe.m10858d(AbstractC6663m.g0(arrayListM12754R), AbstractC6663m.g0(new C4261c('0', '9'))), AbstractC6662l.m12710M(new Character[]{'-', '.', '_', '~'}));
        LinkedHashSet linkedHashSetM10858d2 = qe.m10858d(linkedHashSetM10858d, AbstractC6662l.m12710M(new Character[]{'!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '='}));
        LinkedHashSet linkedHashSetM10858d3 = qe.m10858d(linkedHashSetM10858d2, AbstractC6662l.m12710M(new Character[]{':', '@'}));
        LinkedHashSet linkedHashSetM10858d4 = qe.m10858d(linkedHashSetM10858d3, AbstractC6662l.m12710M(new Character[]{'/', '?'}));
        Set setM10856b = qe.m10856b(linkedHashSetM10858d4, AbstractC6662l.m12710M(new Character[]{'&', '='}));
        f32357g = new C6813g("host", qe.m10859e(linkedHashSetM10858d, ':'));
        f32358h = new C6813g("user info", linkedHashSetM10858d2);
        f32359i = new C6813g("path", linkedHashSetM10858d3);
        f32360j = new C6813g("query string", setM10856b);
        f32361k = new C6813g("fragment", linkedHashSetM10858d4);
        f32362l = new C6813g("form URL", linkedHashSetM10858d);
        f32363m = new C6813g("Smithy label", linkedHashSetM10858d);
        f32364n = new C6813g("SigV4", linkedHashSetM10858d);
    }

    public C6813g(String str, Set set) {
        this.f32365b = str;
        this.f32366c = set;
        int i10 = 0;
        C4266h c4266hM11919j = w9.m11919j(0, 128);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c4266hM11919j, 10));
        C4265g it = c4266hM11919j.iterator();
        while (it.f21651c) {
            arrayList.add(Character.valueOf((char) it.nextInt()));
        }
        Set set2 = this.f32366c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Character ch2 = (Character) obj;
            ch2.getClass();
            if (!set2.contains(ch2)) {
                arrayList2.add(obj);
            }
        }
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d < 16 ? 16 : iM12776d);
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            char cCharValue = ((Character) obj2).charValue();
            linkedHashMap.put(obj2, "%" + "0123456789ABCDEF".charAt((cCharValue & 255) >> 4) + "0123456789ABCDEF".charAt(cCharValue & 15));
        }
        Map map = this.f32367d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6674x.m12776d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(((Character) entry.getValue()).charValue()));
        }
        this.f32368e = AbstractC6674x.m12780h(linkedHashMap, linkedHashMap2);
        Set set3 = this.f32366c;
        int iM12776d2 = AbstractC6674x.m12776d(AbstractC6664n.m12768r(set3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM12776d2 < 16 ? 16 : iM12776d2);
        for (Object obj3 : set3) {
            Character ch3 = (Character) obj3;
            ch3.getClass();
            linkedHashMap3.put(obj3, ch3);
        }
        Set<Map.Entry> setEntrySet = AbstractC6674x.m12780h(linkedHashMap3, this.f32367d).entrySet();
        int iM12776d3 = AbstractC6674x.m12776d(AbstractC6664n.m12768r(setEntrySet, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM12776d3 >= 16 ? iM12776d3 : 16);
        for (Map.Entry entry2 : setEntrySet) {
            Character ch4 = (Character) entry2.getKey();
            ch4.getClass();
            Character ch5 = (Character) entry2.getValue();
            ch5.getClass();
            linkedHashMap4.put(ch5, ch4);
        }
        this.f32369f = linkedHashMap4;
    }

    @Override // sd.InterfaceC6811e
    /* renamed from: a */
    public final C6808b mo12984a(String decoded) {
        AbstractC4154l.m8923f(decoded, "decoded");
        return new C6808b(decoded, m12988d(decoded), this);
    }

    @Override // sd.InterfaceC6811e
    /* renamed from: b */
    public final C6808b mo12985b(String encoded) {
        AbstractC4154l.m8923f(encoded, "encoded");
        return new C6808b(m12987c(encoded), encoded, this);
    }

    /* renamed from: c */
    public final String m12987c(String encoded) {
        AbstractC4154l.m8923f(encoded, "encoded");
        StringBuilder sb2 = new StringBuilder(encoded.length());
        byte[] bArr = null;
        int i10 = 0;
        while (i10 < encoded.length()) {
            char cCharAt = encoded.charAt(i10);
            if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(encoded.length() - i10) / 3];
                }
                int i11 = 0;
                while (i10 + 2 < encoded.length() && cCharAt == '%') {
                    int i12 = i10 + 3;
                    String strSubstring = encoded.substring(i10 + 1, i12);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    Integer numM10139u = AbstractC5185w.m10139u(16, strSubstring);
                    if (numM10139u == null) {
                        break;
                    }
                    byte bIntValue = (byte) numM10139u.intValue();
                    int i13 = i11 + 1;
                    bArr[i11] = bIntValue;
                    if (i12 < encoded.length()) {
                        cCharAt = encoded.charAt(i12);
                    }
                    i11 = i13;
                    i10 = i12;
                }
                sb2.append(AbstractC5185w.m10127i(bArr, 0, i11, false));
                if (i10 != encoded.length() && cCharAt == '%') {
                    sb2.append(cCharAt);
                }
            } else {
                Character ch2 = (Character) this.f32369f.get(Character.valueOf(cCharAt));
                if (ch2 != null) {
                    cCharAt = ch2.charValue();
                }
                sb2.append(cCharAt);
            }
            i10++;
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public final String m12988d(String decoded) {
        AbstractC4154l.m8923f(decoded, "decoded");
        StringBuilder sb2 = new StringBuilder(decoded.length());
        for (byte b10 : AbstractC5185w.m10128j(decoded)) {
            char c2 = (char) b10;
            if (this.f32366c.contains(Character.valueOf(c2))) {
                sb2.append(c2);
            } else {
                String str = (String) this.f32368e.get(Character.valueOf(c2));
                if (str != null) {
                    sb2.append(str);
                } else {
                    sb2.append('%');
                    sb2.append("0123456789ABCDEF".charAt((b10 & 255) >> 4));
                    sb2.append("0123456789ABCDEF".charAt(b10 & 15));
                }
            }
        }
        return sb2.toString();
    }

    @Override // sd.InterfaceC6811e
    public final String getName() {
        return this.f32365b;
    }
}
