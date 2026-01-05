package p001o;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.perf.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.protocol.HTTP;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class di3 {

    /* renamed from: a */
    public static byte f19881a;

    /* renamed from: b */
    public static final C12927d f19882b = new C12927d(1, CredentialsData.CREDENTIALS_TYPE_ANDROID);

    /* renamed from: c */
    public static final Comparator f19883c = new C12924a();

    /* renamed from: o.di3$a */
    public class C12924a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C12925b c12925b, C12925b c12925b2) {
            return c12925b.f19886c - c12925b2.f19886c;
        }
    }

    /* renamed from: o.di3$b */
    public static class C12925b {

        /* renamed from: a */
        public final byte f19884a;

        /* renamed from: b */
        public final byte f19885b;

        /* renamed from: c */
        public final short f19886c;

        /* renamed from: d */
        public final String f19887d;

        /* renamed from: e */
        public final int f19888e;

        public C12925b(int i, String str, int i2) {
            this.f19887d = str;
            this.f19888e = i2;
            this.f19886c = (short) (65535 & i);
            this.f19885b = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
            this.f19884a = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
        }
    }

    /* renamed from: o.di3$c */
    public static class C12926c {

        /* renamed from: a */
        public final C12928e f19889a;

        /* renamed from: b */
        public final C12927d f19890b;

        /* renamed from: c */
        public final C12931h f19891c = new C12931h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: d */
        public final C12931h f19892d;

        /* renamed from: e */
        public final C12934k f19893e;

        public C12926c(C12927d c12927d, List list) {
            this.f19890b = c12927d;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((C12925b) list.get(i)).f19887d;
            }
            this.f19892d = new C12931h(true, strArr);
            this.f19893e = new C12934k(list);
            this.f19889a = new C12928e((short) 512, (short) 288, m23178a());
        }

        /* renamed from: a */
        public int m23178a() {
            return this.f19891c.m23186a() + 288 + this.f19892d.m23186a() + this.f19893e.m23195b();
        }

        /* renamed from: b */
        public void m23179b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f19889a.m23182a(byteArrayOutputStream);
            byteArrayOutputStream.write(di3.m23168j(this.f19890b.f19894a));
            char[] charArray = this.f19890b.f19895b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(di3.m23166h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(di3.m23166h((char) 0));
                }
            }
            byteArrayOutputStream.write(di3.m23168j(288));
            byteArrayOutputStream.write(di3.m23168j(0));
            byteArrayOutputStream.write(di3.m23168j(this.f19891c.m23186a() + 288));
            byteArrayOutputStream.write(di3.m23168j(0));
            byteArrayOutputStream.write(di3.m23168j(0));
            this.f19891c.m23188c(byteArrayOutputStream);
            this.f19892d.m23188c(byteArrayOutputStream);
            this.f19893e.m23196c(byteArrayOutputStream);
        }
    }

    /* renamed from: o.di3$d */
    public static class C12927d {

        /* renamed from: a */
        public final int f19894a;

        /* renamed from: b */
        public final String f19895b;

        public C12927d(int i, String str) {
            this.f19894a = i;
            this.f19895b = str;
        }
    }

    /* renamed from: o.di3$e */
    public static class C12928e {

        /* renamed from: a */
        public final short f19896a;

        /* renamed from: b */
        public final short f19897b;

        /* renamed from: c */
        public final int f19898c;

        public C12928e(short s, short s2, int i) {
            this.f19896a = s;
            this.f19897b = s2;
            this.f19898c = i;
        }

        /* renamed from: a */
        public void m23182a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(di3.m23169k(this.f19896a));
            byteArrayOutputStream.write(di3.m23169k(this.f19897b));
            byteArrayOutputStream.write(di3.m23168j(this.f19898c));
        }
    }

    /* renamed from: o.di3$f */
    public static class C12929f {

        /* renamed from: a */
        public final int f19899a;

        /* renamed from: b */
        public final int f19900b;

        public C12929f(int i, int i2) {
            this.f19899a = i;
            this.f19900b = i2;
        }

        /* renamed from: a */
        public void m23183a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(di3.m23169k((short) 8));
            byteArrayOutputStream.write(di3.m23169k((short) 2));
            byteArrayOutputStream.write(di3.m23168j(this.f19899a));
            byteArrayOutputStream.write(di3.m23169k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(di3.m23168j(this.f19900b));
        }
    }

    /* renamed from: o.di3$g */
    public static class C12930g {

        /* renamed from: a */
        public final C12928e f19901a;

        /* renamed from: b */
        public final int f19902b;

        /* renamed from: d */
        public final List f19904d = new ArrayList();

        /* renamed from: c */
        public final C12931h f19903c = new C12931h(new String[0]);

        public C12930g(Map map) {
            this.f19902b = map.size();
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                Collections.sort(list, di3.f19883c);
                this.f19904d.add(new C12926c((C12927d) entry.getKey(), list));
            }
            this.f19901a = new C12928e((short) 2, (short) 12, m23184a());
        }

        /* renamed from: a */
        public final int m23184a() {
            Iterator it = this.f19904d.iterator();
            int iM23178a = 0;
            while (it.hasNext()) {
                iM23178a += ((C12926c) it.next()).m23178a();
            }
            return this.f19903c.m23186a() + 12 + iM23178a;
        }

        /* renamed from: b */
        public void m23185b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f19901a.m23182a(byteArrayOutputStream);
            byteArrayOutputStream.write(di3.m23168j(this.f19902b));
            this.f19903c.m23188c(byteArrayOutputStream);
            Iterator it = this.f19904d.iterator();
            while (it.hasNext()) {
                ((C12926c) it.next()).m23179b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: o.di3$h */
    public static class C12931h {

        /* renamed from: a */
        public final C12928e f19905a;

        /* renamed from: b */
        public final int f19906b;

        /* renamed from: c */
        public final int f19907c;

        /* renamed from: d */
        public final int f19908d;

        /* renamed from: e */
        public final int f19909e;

        /* renamed from: f */
        public final List f19910f;

        /* renamed from: g */
        public final List f19911g;

        /* renamed from: h */
        public final List f19912h;

        /* renamed from: i */
        public final List f19913i;

        /* renamed from: j */
        public final boolean f19914j;

        /* renamed from: k */
        public final int f19915k;

        /* renamed from: l */
        public final int f19916l;

        public C12931h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: a */
        public int m23186a() {
            return this.f19916l;
        }

        /* renamed from: b */
        public final Pair m23187b(String str) {
            return new Pair(this.f19914j ? di3.m23171m(str) : di3.m23170l(str), Collections.emptyList());
        }

        /* renamed from: c */
        public void m23188c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f19905a.m23182a(byteArrayOutputStream);
            byteArrayOutputStream.write(di3.m23168j(this.f19906b));
            byteArrayOutputStream.write(di3.m23168j(this.f19907c));
            byteArrayOutputStream.write(di3.m23168j(this.f19914j ? 256 : 0));
            byteArrayOutputStream.write(di3.m23168j(this.f19908d));
            byteArrayOutputStream.write(di3.m23168j(this.f19909e));
            Iterator it = this.f19910f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(di3.m23168j(((Integer) it.next()).intValue()));
            }
            Iterator it2 = this.f19911g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(di3.m23168j(((Integer) it2.next()).intValue()));
            }
            Iterator it3 = this.f19912h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write((byte[]) it3.next());
            }
            int i = this.f19915k;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            Iterator it4 = this.f19913i.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((List) it4.next()).iterator();
                if (it5.hasNext()) {
                    tq.m50332a(it5.next());
                    throw null;
                }
                byteArrayOutputStream.write(di3.m23168j(-1));
            }
        }

        public C12931h(boolean z, String... strArr) {
            this.f19910f = new ArrayList();
            this.f19911g = new ArrayList();
            this.f19912h = new ArrayList();
            this.f19913i = new ArrayList();
            this.f19914j = z;
            int length = 0;
            for (String str : strArr) {
                Pair pairM23187b = m23187b(str);
                this.f19910f.add(Integer.valueOf(length));
                Object obj = pairM23187b.first;
                length += ((byte[]) obj).length;
                this.f19912h.add((byte[]) obj);
                this.f19913i.add((List) pairM23187b.second);
            }
            int size = 0;
            for (List list : this.f19913i) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tq.m50332a(it.next());
                    this.f19910f.add(Integer.valueOf(length));
                    length += C12932i.m23189a(null).length;
                    this.f19912h.add(C12932i.m23189a(null));
                }
                this.f19911g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i = length % 4;
            int i2 = i == 0 ? 0 : 4 - i;
            this.f19915k = i2;
            int size2 = this.f19912h.size();
            this.f19906b = size2;
            this.f19907c = this.f19912h.size() - strArr.length;
            boolean z2 = this.f19912h.size() - strArr.length > 0;
            if (!z2) {
                this.f19911g.clear();
                this.f19913i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f19911g.size() * 4);
            this.f19908d = size3;
            int i3 = length + i2;
            this.f19909e = z2 ? size3 + i3 : 0;
            int i4 = size3 + i3 + (z2 ? size : 0);
            this.f19916l = i4;
            this.f19905a = new C12928e((short) 1, (short) 28, i4);
        }
    }

    /* renamed from: o.di3$i */
    public static class C12932i {
        /* renamed from: a */
        public static /* synthetic */ byte[] m23189a(C12932i c12932i) {
            throw null;
        }
    }

    /* renamed from: o.di3$j */
    public static class C12933j {

        /* renamed from: a */
        public final C12928e f19917a;

        /* renamed from: b */
        public final int f19918b;

        /* renamed from: c */
        public final byte[] f19919c;

        /* renamed from: d */
        public final int[] f19920d;

        /* renamed from: e */
        public final C12929f[] f19921e;

        public C12933j(List list, Set set, int i) {
            byte[] bArr = new byte[64];
            this.f19919c = bArr;
            this.f19918b = i;
            bArr[0] = 64;
            this.f19921e = new C12929f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f19921e[i2] = new C12929f(i2, ((C12925b) list.get(i2)).f19888e);
            }
            this.f19920d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f19920d[s] = i3;
                    i3 += 16;
                } else {
                    this.f19920d[s] = -1;
                }
            }
            this.f19917a = new C12928e((short) 513, (short) 84, m23190a());
        }

        /* renamed from: a */
        public int m23190a() {
            return m23191b() + (this.f19921e.length * 16);
        }

        /* renamed from: b */
        public final int m23191b() {
            return m23192c() + 84;
        }

        /* renamed from: c */
        public final int m23192c() {
            return this.f19920d.length * 4;
        }

        /* renamed from: d */
        public void m23193d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f19917a.m23182a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{di3.f19881a, 0, 0, 0});
            byteArrayOutputStream.write(di3.m23168j(this.f19918b));
            byteArrayOutputStream.write(di3.m23168j(m23191b()));
            byteArrayOutputStream.write(this.f19919c);
            for (int i : this.f19920d) {
                byteArrayOutputStream.write(di3.m23168j(i));
            }
            for (C12929f c12929f : this.f19921e) {
                c12929f.m23183a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: o.di3$k */
    public static class C12934k {

        /* renamed from: a */
        public final C12928e f19922a;

        /* renamed from: b */
        public final int f19923b;

        /* renamed from: c */
        public final int[] f19924c;

        /* renamed from: d */
        public final C12933j f19925d;

        public C12934k(List list) {
            this.f19923b = ((C12925b) list.get(list.size() - 1)).f19886c + 1;
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(((C12925b) it.next()).f19886c));
            }
            this.f19924c = new int[this.f19923b];
            for (short s = 0; s < this.f19923b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f19924c[s] = 1073741824;
                }
            }
            this.f19922a = new C12928e((short) 514, (short) 16, m23194a());
            this.f19925d = new C12933j(list, hashSet, this.f19923b);
        }

        /* renamed from: a */
        public final int m23194a() {
            return (this.f19923b * 4) + 16;
        }

        /* renamed from: b */
        public int m23195b() {
            return m23194a() + this.f19925d.m23190a();
        }

        /* renamed from: c */
        public void m23196c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f19922a.m23182a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{di3.f19881a, 0, 0, 0});
            byteArrayOutputStream.write(di3.m23168j(this.f19923b));
            for (int i : this.f19924c) {
                byteArrayOutputStream.write(di3.m23168j(i));
            }
            this.f19925d.m23193d(byteArrayOutputStream);
        }
    }

    /* renamed from: h */
    public static byte[] m23166h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & Constants.MAX_HOST_LENGTH)};
    }

    /* renamed from: i */
    public static byte[] m23167i(Context context, Map map) throws IOException {
        C12927d c12927d;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        C12927d c12927d2 = new C12927d(Opcodes.LAND, context.getPackageName());
        HashMap map2 = new HashMap();
        C12925b c12925b = null;
        for (Map.Entry entry : map.entrySet()) {
            C12925b c12925b2 = new C12925b(((Integer) entry.getKey()).intValue(), context.getResources().getResourceName(((Integer) entry.getKey()).intValue()), ((Integer) entry.getValue()).intValue());
            if (!context.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + c12925b2.f19887d + ", typeId=" + Integer.toHexString(c12925b2.f19885b & 255));
            }
            if (c12925b2.f19884a == 1) {
                c12927d = f19882b;
            } else {
                if (c12925b2.f19884a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) c12925b2.f19884a));
                }
                c12927d = c12927d2;
            }
            if (!map2.containsKey(c12927d)) {
                map2.put(c12927d, new ArrayList());
            }
            ((List) map2.get(c12927d)).add(c12925b2);
            c12925b = c12925b2;
        }
        byte b = c12925b.f19885b;
        f19881a = b;
        if (b == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C12930g(map2).m23185b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: j */
    public static byte[] m23168j(int i) {
        return new byte[]{(byte) (i & Constants.MAX_HOST_LENGTH), (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH), (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH), (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH)};
    }

    /* renamed from: k */
    public static byte[] m23169k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & Constants.MAX_HOST_LENGTH)};
    }

    /* renamed from: l */
    public static byte[] m23170l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] bArrM23169k = m23169k((short) charArray.length);
        bArr[0] = bArrM23169k[0];
        bArr[1] = bArrM23169k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] bArrM23166h = m23166h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = bArrM23166h[0];
            bArr[i2 + 3] = bArrM23166h[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m23171m(String str) {
        byte[] bytes = str.getBytes(Charset.forName(HTTP.UTF_8));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
