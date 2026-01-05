package p001o;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class m3d {

    /* renamed from: a */
    public Object f34704a;

    public m3d(Object obj) {
        this.f34704a = obj;
    }

    /* renamed from: d */
    public static m3d m38237d(Activity activity) {
        return activity instanceof AppCompatActivity ? new nj0((AppCompatActivity) activity) : new ls(activity);
    }

    /* renamed from: e */
    public static m3d m38238e(Fragment fragment) {
        return new xdg(fragment);
    }

    /* renamed from: a */
    public abstract void mo37852a(int i, String... strArr);

    /* renamed from: b */
    public abstract Context mo37853b();

    /* renamed from: c */
    public Object m38239c() {
        return this.f34704a;
    }

    /* renamed from: f */
    public boolean m38240f(String str) {
        return !mo37854i(str);
    }

    /* renamed from: g */
    public void m38241g(String str, String str2, String str3, int i, int i2, String... strArr) {
        if (m38242h(strArr)) {
            mo37855j(str, str2, str3, i, i2, strArr);
        } else {
            mo37852a(i2, strArr);
        }
    }

    /* renamed from: h */
    public final boolean m38242h(String... strArr) {
        for (String str : strArr) {
            if (mo37854i(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public abstract boolean mo37854i(String str);

    /* renamed from: j */
    public abstract void mo37855j(String str, String str2, String str3, int i, int i2, String... strArr);

    /* renamed from: k */
    public boolean m38243k(String... strArr) {
        return m38242h(strArr);
    }

    /* renamed from: l */
    public boolean m38244l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m38240f((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
