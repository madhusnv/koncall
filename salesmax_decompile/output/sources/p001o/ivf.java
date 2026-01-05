package p001o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class ivf implements ana {

    /* renamed from: d */
    public static final Bitmap.Config[] f29269d;

    /* renamed from: e */
    public static final Bitmap.Config[] f29270e;

    /* renamed from: f */
    public static final Bitmap.Config[] f29271f;

    /* renamed from: g */
    public static final Bitmap.Config[] f29272g;

    /* renamed from: h */
    public static final Bitmap.Config[] f29273h;

    /* renamed from: a */
    public final C14382c f29274a = new C14382c();

    /* renamed from: b */
    public final mv7 f29275b = new mv7();

    /* renamed from: c */
    public final Map f29276c = new HashMap();

    /* renamed from: o.ivf$a */
    public static /* synthetic */ class C14380a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29277a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f29277a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29277a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29277a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29277a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.ivf$b */
    public static final class C14381b implements ced {

        /* renamed from: a */
        public final C14382c f29278a;

        /* renamed from: b */
        public int f29279b;

        /* renamed from: c */
        public Bitmap.Config f29280c;

        public C14381b(C14382c c14382c) {
            this.f29278a = c14382c;
        }

        @Override // p001o.ced
        /* renamed from: a */
        public void mo21086a() {
            this.f29278a.m26431c(this);
        }

        /* renamed from: b */
        public void m32865b(int i, Bitmap.Config config) {
            this.f29279b = i;
            this.f29280c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14381b)) {
                return false;
            }
            C14381b c14381b = (C14381b) obj;
            return this.f29279b == c14381b.f29279b && uqi.m51922c(this.f29280c, c14381b.f29280c);
        }

        public int hashCode() {
            int i = this.f29279b * 31;
            Bitmap.Config config = this.f29280c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return ivf.m32860i(this.f29279b, this.f29280c);
        }
    }

    /* renamed from: o.ivf$c */
    public static class C14382c extends fc1 {
        @Override // p001o.fc1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C14381b mo26429a() {
            return new C14381b(this);
        }

        /* renamed from: e */
        public C14381b m32867e(int i, Bitmap.Config config) {
            C14381b c14381b = (C14381b) m26430b();
            c14381b.m32865b(i, config);
            return c14381b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f29269d = configArr;
        f29270e = configArr;
        f29271f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f29272g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f29273h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: i */
    public static String m32860i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    public static Bitmap.Config[] m32861j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f29270e;
        }
        int i = C14380a.f29277a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : f29273h : f29272g : f29271f : f29269d;
    }

    @Override // p001o.ana
    /* renamed from: a */
    public String mo17513a(Bitmap bitmap) {
        return m32860i(uqi.m51926g(bitmap), bitmap.getConfig());
    }

    @Override // p001o.ana
    /* renamed from: b */
    public Bitmap mo17514b() {
        Bitmap bitmap = (Bitmap) this.f29275b.m39721f();
        if (bitmap != null) {
            m32862g(Integer.valueOf(uqi.m51926g(bitmap)), bitmap);
        }
        return bitmap;
    }

    @Override // p001o.ana
    /* renamed from: c */
    public void mo17515c(Bitmap bitmap) {
        C14381b c14381bM32867e = this.f29274a.m32867e(uqi.m51926g(bitmap), bitmap.getConfig());
        this.f29275b.m39720d(c14381bM32867e, bitmap);
        NavigableMap navigableMapM32864k = m32864k(bitmap.getConfig());
        Integer num = (Integer) navigableMapM32864k.get(Integer.valueOf(c14381bM32867e.f29279b));
        navigableMapM32864k.put(Integer.valueOf(c14381bM32867e.f29279b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p001o.ana
    /* renamed from: d */
    public Bitmap mo17516d(int i, int i2, Bitmap.Config config) {
        C14381b c14381bM32863h = m32863h(uqi.m51925f(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f29275b.m39717a(c14381bM32863h);
        if (bitmap != null) {
            m32862g(Integer.valueOf(c14381bM32863h.f29279b), bitmap);
            bitmap.getLastToken();
        }
        return bitmap;
    }

    @Override // p001o.ana
    /* renamed from: e */
    public String mo17517e(int i, int i2, Bitmap.Config config) {
        return m32860i(uqi.m51925f(i, i2, config), config);
    }

    @Override // p001o.ana
    /* renamed from: f */
    public int mo17518f(Bitmap bitmap) {
        return uqi.m51926g(bitmap);
    }

    /* renamed from: g */
    public final void m32862g(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM32864k = m32864k(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM32864k.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM32864k.remove(num);
                return;
            } else {
                navigableMapM32864k.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo17513a(bitmap) + ", this: " + this);
    }

    /* renamed from: h */
    public final C14381b m32863h(int i, Bitmap.Config config) {
        C14381b c14381bM32867e = this.f29274a.m32867e(i, config);
        for (Bitmap.Config config2 : m32861j(config)) {
            Integer num = (Integer) m32864k(config2).ceilingKey(Integer.valueOf(i));
            if (num != null && num.intValue() <= i * 8) {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return c14381bM32867e;
                        }
                    } else if (config2.equals(config)) {
                        return c14381bM32867e;
                    }
                }
                this.f29274a.m26431c(c14381bM32867e);
                return this.f29274a.m32867e(num.intValue(), config2);
            }
        }
        return c14381bM32867e;
    }

    /* renamed from: k */
    public final NavigableMap m32864k(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f29276c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f29276c.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f29275b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f29276c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f29276c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
