package p001o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import lombok.launch.PatchFixesHider;

/* loaded from: classes3.dex */
public class smb {

    /* renamed from: a */
    public final ktf f45644a = new ktf();

    /* renamed from: b */
    public final ktf f45645b = new ktf();

    /* renamed from: a */
    public static void m48545a(smb smbVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            smbVar.m48556l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            smbVar.m48557m(objectAnimator.getPropertyName(), tmb.m50199b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: c */
    public static smb m48546c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m48547d(context, resourceId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static smb m48547d(Context context, int i) {
        try {
            Object objFindMethod = PatchFixesHider.Util.findMethod(context, i, null);
            if (objFindMethod instanceof AnimatorSet) {
                return m48548e(((AnimatorSet) objFindMethod).getChildAnimations());
            }
            if (objFindMethod == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(objFindMethod);
            return m48548e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    /* renamed from: e */
    public static smb m48548e(List list) {
        smb smbVar = new smb();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m48545a(smbVar, (Animator) list.get(i));
        }
        return smbVar;
    }

    /* renamed from: b */
    public final PropertyValuesHolder[] m48549b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof smb) {
            return this.f45644a.equals(((smb) obj).f45644a);
        }
        return false;
    }

    /* renamed from: f */
    public ObjectAnimator m48550f(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, m48551g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        m48552h(str).m50200a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] m48551g(String str) {
        if (m48554j(str)) {
            return m48549b((PropertyValuesHolder[]) this.f45645b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public tmb m48552h(String str) {
        if (m48555k(str)) {
            return (tmb) this.f45644a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f45644a.hashCode();
    }

    /* renamed from: i */
    public long m48553i() {
        int size = this.f45644a.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            tmb tmbVar = (tmb) this.f45644a.m36228o(i);
            jMax = Math.max(jMax, tmbVar.m50201c() + tmbVar.m50202d());
        }
        return jMax;
    }

    /* renamed from: j */
    public boolean m48554j(String str) {
        return this.f45645b.get(str) != null;
    }

    /* renamed from: k */
    public boolean m48555k(String str) {
        return this.f45644a.get(str) != null;
    }

    /* renamed from: l */
    public void m48556l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f45645b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void m48557m(String str, tmb tmbVar) {
        this.f45644a.put(str, tmbVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f45644a + "}\n";
    }
}
