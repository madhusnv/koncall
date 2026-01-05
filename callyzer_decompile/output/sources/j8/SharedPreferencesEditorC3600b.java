package j8;

import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import com.sun.mail.util.AbstractC1452a;
import ii.AbstractC3264f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.b */
/* loaded from: classes.dex */
public final class SharedPreferencesEditorC3600b implements SharedPreferences.Editor {

    /* renamed from: a */
    public final SharedPreferencesC3604f f19225a;

    /* renamed from: b */
    public final SharedPreferences.Editor f19226b;

    /* renamed from: d */
    public final AtomicBoolean f19228d = new AtomicBoolean(false);

    /* renamed from: c */
    public final CopyOnWriteArrayList f19227c = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC3600b(SharedPreferencesC3604f sharedPreferencesC3604f, SharedPreferences.Editor editor) {
        this.f19225a = sharedPreferencesC3604f;
        this.f19226b = editor;
    }

    /* renamed from: a */
    public final void m8161a() {
        if (this.f19228d.getAndSet(false)) {
            SharedPreferencesC3604f sharedPreferencesC3604f = this.f19225a;
            for (String str : ((HashMap) sharedPreferencesC3604f.getAll()).keySet()) {
                if (!this.f19227c.contains(str) && !SharedPreferencesC3604f.m8164c(str)) {
                    this.f19226b.remove(sharedPreferencesC3604f.m8165a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m8161a();
        this.f19226b.apply();
        m8162b();
        this.f19227c.clear();
    }

    /* renamed from: b */
    public final void m8162b() {
        SharedPreferencesC3604f sharedPreferencesC3604f = this.f19225a;
        ArrayList arrayList = sharedPreferencesC3604f.f19230b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) obj;
            Iterator it = this.f19227c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC3604f, (String) it.next());
            }
        }
    }

    /* renamed from: c */
    public final void m8163c(String str, byte[] bArr) {
        SharedPreferencesC3604f sharedPreferencesC3604f = this.f19225a;
        sharedPreferencesC3604f.getClass();
        if (SharedPreferencesC3604f.m8164c(str)) {
            throw new SecurityException(AbstractC1452a.m4561h(str, " is a reserved key for the encryption keyset."));
        }
        this.f19227c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM8165a = sharedPreferencesC3604f.m8165a(str);
            try {
                Pair pair = new Pair(strM8165a, new String(AbstractC3264f.m7610b(sharedPreferencesC3604f.f19232d.mo308a(bArr, strM8165a.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f19226b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f19228d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19227c;
        m8161a();
        try {
            return this.f19226b.commit();
        } finally {
            m8162b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(EnumC3601c.BOOLEAN.getId());
        byteBufferAllocate.put(z6 ? (byte) 1 : (byte) 0);
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(EnumC3601c.FLOAT.getId());
        byteBufferAllocate.putFloat(f6);
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(EnumC3601c.INT.getId());
        byteBufferAllocate.putInt(i10);
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(EnumC3601c.LONG.getId());
        byteBufferAllocate.putLong(j6);
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(EnumC3601c.STRING.getId());
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        Set set2 = set;
        if (set == null) {
            ArraySet arraySet = new ArraySet();
            arraySet.add("__NULL__");
            set2 = arraySet;
        }
        ArrayList arrayList = new ArrayList(set2.size());
        int size = set2.size() * 4;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(EnumC3601c.STRING_SET.getId());
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m8163c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC3604f sharedPreferencesC3604f = this.f19225a;
        sharedPreferencesC3604f.getClass();
        if (SharedPreferencesC3604f.m8164c(str)) {
            throw new SecurityException(AbstractC1452a.m4561h(str, " is a reserved key for the encryption keyset."));
        }
        this.f19226b.remove(sharedPreferencesC3604f.m8165a(str));
        this.f19227c.remove(str);
        return this;
    }
}
