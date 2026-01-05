package p001o;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class sha implements rha {

    /* renamed from: a */
    public final LocaleList f45442a;

    public sha(Object obj) {
        this.f45442a = (LocaleList) obj;
    }

    @Override // p001o.rha
    /* renamed from: a */
    public String mo46775a() {
        return this.f45442a.toLanguageTags();
    }

    @Override // p001o.rha
    /* renamed from: b */
    public Object mo46776b() {
        return this.f45442a;
    }

    public boolean equals(Object obj) {
        return this.f45442a.equals(((rha) obj).mo46776b());
    }

    @Override // p001o.rha
    public Locale get(int i) {
        return this.f45442a.get(i);
    }

    public int hashCode() {
        return this.f45442a.hashCode();
    }

    @Override // p001o.rha
    public boolean isEmpty() {
        return this.f45442a.isEmpty();
    }

    @Override // p001o.rha
    public int size() {
        return this.f45442a.size();
    }

    public String toString() {
        return this.f45442a.toString();
    }
}
