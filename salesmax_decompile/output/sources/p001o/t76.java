package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.qe0;

/* loaded from: classes2.dex */
public final class t76 implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f46573a;

    /* renamed from: b */
    public final List f46574b = new ArrayList();

    /* renamed from: c */
    public final String f46575c;

    /* renamed from: d */
    public final String f46576d;

    /* renamed from: e */
    public final p70 f46577e;

    /* renamed from: f */
    public final yp5 f46578f;

    /* renamed from: o.t76$a */
    public static /* synthetic */ class C17011a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46579a;

        static {
            int[] iArr = new int[EnumC17013c.values().length];
            f46579a = iArr;
            try {
                iArr[EnumC17013c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46579a[EnumC17013c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46579a[EnumC17013c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46579a[EnumC17013c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46579a[EnumC17013c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46579a[EnumC17013c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.t76$b */
    public static final class SharedPreferencesEditorC17012b implements SharedPreferences.Editor {

        /* renamed from: a */
        public final t76 f46580a;

        /* renamed from: b */
        public final SharedPreferences.Editor f46581b;

        /* renamed from: d */
        public AtomicBoolean f46583d = new AtomicBoolean(false);

        /* renamed from: c */
        public final List f46582c = new CopyOnWriteArrayList();

        public SharedPreferencesEditorC17012b(t76 t76Var, SharedPreferences.Editor editor) {
            this.f46580a = t76Var;
            this.f46581b = editor;
        }

        /* renamed from: a */
        public final void m49532a() {
            if (this.f46583d.getAndSet(false)) {
                for (String str : this.f46580a.getAll().keySet()) {
                    if (!this.f46582c.contains(str) && !this.f46580a.m49531f(str)) {
                        this.f46581b.remove(this.f46580a.m49528c(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            m49532a();
            this.f46581b.apply();
            m49533b();
            this.f46582c.clear();
        }

        /* renamed from: b */
        public final void m49533b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f46580a.f46574b) {
                Iterator it = this.f46582c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f46580a, (String) it.next());
                }
            }
        }

        /* renamed from: c */
        public final void m49534c(String str, byte[] bArr) {
            if (this.f46580a.m49531f(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f46582c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairM49529d = this.f46580a.m49529d(str, bArr);
                this.f46581b.putString((String) pairM49529d.first, (String) pairM49529d.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f46583d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            m49532a();
            try {
                return this.f46581b.commit();
            } finally {
                m49533b();
                this.f46582c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(EnumC17013c.BOOLEAN.getId());
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EnumC17013c.FLOAT.getId());
            byteBufferAllocate.putFloat(f);
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EnumC17013c.INT.getId());
            byteBufferAllocate.putInt(i);
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(EnumC17013c.LONG.getId());
            byteBufferAllocate.putLong(j);
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(EnumC17013c.STRING.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new ArraySet();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(EnumC17013c.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            m49534c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f46580a.m49531f(str)) {
                this.f46581b.remove(this.f46580a.m49528c(str));
                this.f46582c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: o.t76$c */
    public enum EnumC17013c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EnumC17013c(int i) {
            this.mId = i;
        }

        public static EnumC17013c fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* renamed from: o.t76$d */
    public enum EnumC17014d {
        AES256_SIV(u80.m51187j());

        private final hd9 mDeterministicAeadKeyTemplate;

        EnumC17014d(hd9 hd9Var) {
            this.mDeterministicAeadKeyTemplate = hd9Var;
        }

        public hd9 getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* renamed from: o.t76$e */
    public enum EnumC17015e {
        AES256_GCM(m80.m38514j());

        private final hd9 mAeadKeyTemplate;

        EnumC17015e(hd9 hd9Var) {
            this.mAeadKeyTemplate = hd9Var;
        }

        public hd9 getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    public t76(String str, String str2, SharedPreferences sharedPreferences, p70 p70Var, yp5 yp5Var) {
        this.f46575c = str;
        this.f46573a = sharedPreferences;
        this.f46576d = str2;
        this.f46577e = p70Var;
        this.f46578f = yp5Var;
    }

    /* renamed from: a */
    public static SharedPreferences m49526a(String str, String str2, Context context, EnumC17014d enumC17014d, EnumC17015e enumC17015e) {
        zp5.m59674b();
        q70.m44908b();
        yd9 yd9VarM45214c = new qe0.C16353b().m45222h(enumC17014d.getKeyTemplate()).m45224j(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m45223i("android-keystore://" + str2).m45218d().m45214c();
        yd9 yd9VarM45214c2 = new qe0.C16353b().m45222h(enumC17015e.getKeyTemplate()).m45224j(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m45223i("android-keystore://" + str2).m45218d().m45214c();
        return new t76(str, str2, context.getSharedPreferences(str, 0), (p70) yd9VarM45214c2.m57637h(p70.class), (yp5) yd9VarM45214c.m57637h(yp5.class));
    }

    /* renamed from: b */
    public String m49527b(String str) {
        try {
            String str2 = new String(this.f46578f.mo17651b(ab1.m16794a(str, 0), this.f46575c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public String m49528c(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return ab1.m16797d(this.f46578f.mo17650a(str.getBytes(StandardCharsets.UTF_8), this.f46575c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!m49531f(str)) {
            return this.f46573a.contains(m49528c(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    public Pair m49529d(String str, byte[] bArr) {
        String strM49528c = m49528c(str);
        return new Pair(strM49528c, ab1.m16797d(this.f46577e.mo24514a(bArr, strM49528c.getBytes(StandardCharsets.UTF_8))));
    }

    /* renamed from: e */
    public final Object m49530e(String str) {
        if (m49531f(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM49528c = m49528c(str);
            String string = this.f46573a.getString(strM49528c, null);
            if (string == null) {
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f46577e.mo24515b(ab1.m16794a(string, 0), strM49528c.getBytes(StandardCharsets.UTF_8)));
            byteBufferWrap.position(0);
            switch (C17011a.f46579a[EnumC17013c.fromId(byteBufferWrap.getInt()).ordinal()]) {
                case 1:
                    int i = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i);
                    String string2 = StandardCharsets.UTF_8.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    ArraySet arraySet = new ArraySet();
                    while (byteBufferWrap.hasRemaining()) {
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i2);
                        byteBufferWrap.position(byteBufferWrap.position() + i2);
                        arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                default:
                    return null;
            }
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC17012b(this, this.f46573a.edit());
    }

    /* renamed from: f */
    public boolean m49531f(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f46573a.getAll().entrySet()) {
            if (!m49531f(entry.getKey())) {
                String strM49527b = m49527b(entry.getKey());
                map.put(strM49527b, m49530e(strM49527b));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object objM49530e = m49530e(str);
        return (objM49530e == null || !(objM49530e instanceof Boolean)) ? z : ((Boolean) objM49530e).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object objM49530e = m49530e(str);
        return (objM49530e == null || !(objM49530e instanceof Float)) ? f : ((Float) objM49530e).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object objM49530e = m49530e(str);
        return (objM49530e == null || !(objM49530e instanceof Integer)) ? i : ((Integer) objM49530e).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object objM49530e = m49530e(str);
        return (objM49530e == null || !(objM49530e instanceof Long)) ? j : ((Long) objM49530e).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objM49530e = m49530e(str);
        return (objM49530e == null || !(objM49530e instanceof String)) ? str2 : (String) objM49530e;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object objM49530e = m49530e(str);
        Set arraySet = objM49530e instanceof Set ? (Set) objM49530e : new ArraySet();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f46574b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f46574b.remove(onSharedPreferenceChangeListener);
    }
}
