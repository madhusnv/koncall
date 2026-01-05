package p001o;

/* loaded from: classes6.dex */
public final class gce implements ncb {

    /* renamed from: a */
    public final scb f24980a;

    /* renamed from: b */
    public final String f24981b;

    /* renamed from: c */
    public final Object[] f24982c;

    /* renamed from: d */
    public final int f24983d;

    public gce(scb scbVar, String str, Object[] objArr) {
        char cCharAt;
        this.f24980a = scbVar;
        this.f24981b = str;
        this.f24982c = objArr;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.f24983d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f24983d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p001o.ncb
    /* renamed from: a */
    public boolean mo28443a() {
        return (this.f24983d & 2) == 2;
    }

    @Override // p001o.ncb
    /* renamed from: b */
    public scb mo28444b() {
        return this.f24980a;
    }

    @Override // p001o.ncb
    /* renamed from: c */
    public t1e mo28445c() {
        return (this.f24983d & 1) == 1 ? t1e.PROTO2 : t1e.PROTO3;
    }

    /* renamed from: d */
    public Object[] m28446d() {
        return this.f24982c;
    }

    /* renamed from: e */
    public String m28447e() {
        return this.f24981b;
    }
}
