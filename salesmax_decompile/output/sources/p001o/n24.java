package p001o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class n24 {

    /* renamed from: a */
    public final InterfaceC15478f f36265a;

    /* renamed from: o.n24$a */
    public static final class C15473a {

        /* renamed from: a */
        public final InterfaceC15475c f36266a;

        public C15473a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f36266a = new C15474b(clipData, i);
            } else {
                this.f36266a = new C15476d(clipData, i);
            }
        }

        /* renamed from: a */
        public n24 m40012a() {
            return this.f36266a.build();
        }

        /* renamed from: b */
        public C15473a m40013b(Bundle bundle) {
            this.f36266a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C15473a m40014c(int i) {
            this.f36266a.mo40017b(i);
            return this;
        }

        /* renamed from: d */
        public C15473a m40015d(Uri uri) {
            this.f36266a.mo40016a(uri);
            return this;
        }
    }

    /* renamed from: o.n24$b */
    public static final class C15474b implements InterfaceC15475c {

        /* renamed from: a */
        public final ContentInfo.Builder f36267a;

        public C15474b(ClipData clipData, int i) {
            this.f36267a = q24.m44739a(clipData, i);
        }

        @Override // p001o.n24.InterfaceC15475c
        /* renamed from: a */
        public void mo40016a(Uri uri) {
            this.f36267a.setLinkUri(uri);
        }

        @Override // p001o.n24.InterfaceC15475c
        /* renamed from: b */
        public void mo40017b(int i) {
            this.f36267a.setFlags(i);
        }

        @Override // p001o.n24.InterfaceC15475c
        public n24 build() {
            return new n24(new C15477e(this.f36267a.build()));
        }

        @Override // p001o.n24.InterfaceC15475c
        public void setExtras(Bundle bundle) {
            this.f36267a.setExtras(bundle);
        }
    }

    /* renamed from: o.n24$c */
    public interface InterfaceC15475c {
        /* renamed from: a */
        void mo40016a(Uri uri);

        /* renamed from: b */
        void mo40017b(int i);

        n24 build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: o.n24$d */
    public static final class C15476d implements InterfaceC15475c {

        /* renamed from: a */
        public ClipData f36268a;

        /* renamed from: b */
        public int f36269b;

        /* renamed from: c */
        public int f36270c;

        /* renamed from: d */
        public Uri f36271d;

        /* renamed from: e */
        public Bundle f36272e;

        public C15476d(ClipData clipData, int i) {
            this.f36268a = clipData;
            this.f36269b = i;
        }

        @Override // p001o.n24.InterfaceC15475c
        /* renamed from: a */
        public void mo40016a(Uri uri) {
            this.f36271d = uri;
        }

        @Override // p001o.n24.InterfaceC15475c
        /* renamed from: b */
        public void mo40017b(int i) {
            this.f36270c = i;
        }

        @Override // p001o.n24.InterfaceC15475c
        public n24 build() {
            return new n24(new C15479g(this));
        }

        @Override // p001o.n24.InterfaceC15475c
        public void setExtras(Bundle bundle) {
            this.f36272e = bundle;
        }
    }

    /* renamed from: o.n24$e */
    public static final class C15477e implements InterfaceC15478f {

        /* renamed from: a */
        public final ContentInfo f36273a;

        public C15477e(ContentInfo contentInfo) {
            this.f36273a = m24.m38218a(fgd.m26663g(contentInfo));
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: a */
        public ContentInfo mo40018a() {
            return this.f36273a;
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: b */
        public ClipData mo40019b() {
            return this.f36273a.getClip();
        }

        @Override // p001o.n24.InterfaceC15478f
        public int getSource() {
            return this.f36273a.getSource();
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: k */
        public int mo40020k() {
            return this.f36273a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f36273a + "}";
        }
    }

    /* renamed from: o.n24$f */
    public interface InterfaceC15478f {
        /* renamed from: a */
        ContentInfo mo40018a();

        /* renamed from: b */
        ClipData mo40019b();

        int getSource();

        /* renamed from: k */
        int mo40020k();
    }

    /* renamed from: o.n24$g */
    public static final class C15479g implements InterfaceC15478f {

        /* renamed from: a */
        public final ClipData f36274a;

        /* renamed from: b */
        public final int f36275b;

        /* renamed from: c */
        public final int f36276c;

        /* renamed from: d */
        public final Uri f36277d;

        /* renamed from: e */
        public final Bundle f36278e;

        public C15479g(C15476d c15476d) {
            this.f36274a = (ClipData) fgd.m26663g(c15476d.f36268a);
            this.f36275b = fgd.m26659c(c15476d.f36269b, 0, 5, "source");
            this.f36276c = fgd.m26662f(c15476d.f36270c, 1);
            this.f36277d = c15476d.f36271d;
            this.f36278e = c15476d.f36272e;
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: a */
        public ContentInfo mo40018a() {
            return null;
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: b */
        public ClipData mo40019b() {
            return this.f36274a;
        }

        @Override // p001o.n24.InterfaceC15478f
        public int getSource() {
            return this.f36275b;
        }

        @Override // p001o.n24.InterfaceC15478f
        /* renamed from: k */
        public int mo40020k() {
            return this.f36276c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f36274a.getDescription());
            sb.append(", source=");
            sb.append(n24.m40006e(this.f36275b));
            sb.append(", flags=");
            sb.append(n24.m40005a(this.f36276c));
            if (this.f36277d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f36277d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f36278e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public n24(InterfaceC15478f interfaceC15478f) {
        this.f36265a = interfaceC15478f;
    }

    /* renamed from: a */
    public static String m40005a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    public static String m40006e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static n24 m40007g(ContentInfo contentInfo) {
        return new n24(new C15477e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m40008b() {
        return this.f36265a.mo40019b();
    }

    /* renamed from: c */
    public int m40009c() {
        return this.f36265a.mo40020k();
    }

    /* renamed from: d */
    public int m40010d() {
        return this.f36265a.getSource();
    }

    /* renamed from: f */
    public ContentInfo m40011f() {
        ContentInfo contentInfoMo40018a = this.f36265a.mo40018a();
        Objects.requireNonNull(contentInfoMo40018a);
        return m24.m38218a(contentInfoMo40018a);
    }

    public String toString() {
        return this.f36265a.toString();
    }
}
