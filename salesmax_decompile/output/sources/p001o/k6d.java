package p001o;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class k6d {

    /* renamed from: a */
    public CharSequence f31534a;

    /* renamed from: b */
    public IconCompat f31535b;

    /* renamed from: c */
    public String f31536c;

    /* renamed from: d */
    public String f31537d;

    /* renamed from: e */
    public boolean f31538e;

    /* renamed from: f */
    public boolean f31539f;

    /* renamed from: o.k6d$a */
    public static class C14720a {
        /* renamed from: a */
        public static k6d m35049a(Person person) {
            return new C14721b().m35056f(person.getName()).m35053c(person.getIcon() != null ? IconCompat.m5850a(person.getIcon()) : null).m35057g(person.getUri()).m35055e(person.getKey()).m35052b(person.isBot()).m35054d(person.isImportant()).m35051a();
        }

        /* renamed from: b */
        public static Person m35050b(k6d k6dVar) {
            return new Person.Builder().setName(k6dVar.m35042c()).setIcon(k6dVar.m35040a() != null ? k6dVar.m35040a().m5868r() : null).setUri(k6dVar.m35043d()).setKey(k6dVar.m35041b()).setBot(k6dVar.m35044e()).setImportant(k6dVar.m35045f()).build();
        }
    }

    /* renamed from: o.k6d$b */
    public static class C14721b {

        /* renamed from: a */
        public CharSequence f31540a;

        /* renamed from: b */
        public IconCompat f31541b;

        /* renamed from: c */
        public String f31542c;

        /* renamed from: d */
        public String f31543d;

        /* renamed from: e */
        public boolean f31544e;

        /* renamed from: f */
        public boolean f31545f;

        /* renamed from: a */
        public k6d m35051a() {
            return new k6d(this);
        }

        /* renamed from: b */
        public C14721b m35052b(boolean z) {
            this.f31544e = z;
            return this;
        }

        /* renamed from: c */
        public C14721b m35053c(IconCompat iconCompat) {
            this.f31541b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C14721b m35054d(boolean z) {
            this.f31545f = z;
            return this;
        }

        /* renamed from: e */
        public C14721b m35055e(String str) {
            this.f31543d = str;
            return this;
        }

        /* renamed from: f */
        public C14721b m35056f(CharSequence charSequence) {
            this.f31540a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C14721b m35057g(String str) {
            this.f31542c = str;
            return this;
        }
    }

    public k6d(C14721b c14721b) {
        this.f31534a = c14721b.f31540a;
        this.f31535b = c14721b.f31541b;
        this.f31536c = c14721b.f31542c;
        this.f31537d = c14721b.f31543d;
        this.f31538e = c14721b.f31544e;
        this.f31539f = c14721b.f31545f;
    }

    /* renamed from: a */
    public IconCompat m35040a() {
        return this.f31535b;
    }

    /* renamed from: b */
    public String m35041b() {
        return this.f31537d;
    }

    /* renamed from: c */
    public CharSequence m35042c() {
        return this.f31534a;
    }

    /* renamed from: d */
    public String m35043d() {
        return this.f31536c;
    }

    /* renamed from: e */
    public boolean m35044e() {
        return this.f31538e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k6d)) {
            return false;
        }
        k6d k6dVar = (k6d) obj;
        String strM35041b = m35041b();
        String strM35041b2 = k6dVar.m35041b();
        return (strM35041b == null && strM35041b2 == null) ? Objects.equals(Objects.toString(m35042c()), Objects.toString(k6dVar.m35042c())) && Objects.equals(m35043d(), k6dVar.m35043d()) && Objects.equals(Boolean.valueOf(m35044e()), Boolean.valueOf(k6dVar.m35044e())) && Objects.equals(Boolean.valueOf(m35045f()), Boolean.valueOf(k6dVar.m35045f())) : Objects.equals(strM35041b, strM35041b2);
    }

    /* renamed from: f */
    public boolean m35045f() {
        return this.f31539f;
    }

    /* renamed from: g */
    public String m35046g() {
        String str = this.f31536c;
        if (str != null) {
            return str;
        }
        if (this.f31534a == null) {
            return "";
        }
        return "name:" + ((Object) this.f31534a);
    }

    /* renamed from: h */
    public Person m35047h() {
        return C14720a.m35050b(this);
    }

    public int hashCode() {
        String strM35041b = m35041b();
        return strM35041b != null ? strM35041b.hashCode() : Objects.hash(m35042c(), m35043d(), Boolean.valueOf(m35044e()), Boolean.valueOf(m35045f()));
    }

    /* renamed from: i */
    public Bundle m35048i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f31534a);
        IconCompat iconCompat = this.f31535b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m5867q() : null);
        bundle.putString("uri", this.f31536c);
        bundle.putString(TransferTable.COLUMN_KEY, this.f31537d);
        bundle.putBoolean("isBot", this.f31538e);
        bundle.putBoolean("isImportant", this.f31539f);
        return bundle;
    }
}
