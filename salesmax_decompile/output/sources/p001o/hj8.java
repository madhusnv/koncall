package p001o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes2.dex */
public final class hj8 {

    /* renamed from: a */
    public final InterfaceC13984c f27049a;

    /* renamed from: o.hj8$b */
    public static final class C13983b implements InterfaceC13984c {

        /* renamed from: a */
        public final Uri f27051a;

        /* renamed from: b */
        public final ClipDescription f27052b;

        /* renamed from: c */
        public final Uri f27053c;

        public C13983b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f27051a = uri;
            this.f27052b = clipDescription;
            this.f27053c = uri2;
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: a */
        public Object mo30665a() {
            return null;
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: b */
        public Uri mo30666b() {
            return this.f27051a;
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: c */
        public void mo30667c() {
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: d */
        public Uri mo30668d() {
            return this.f27053c;
        }

        @Override // p001o.hj8.InterfaceC13984c
        public ClipDescription getDescription() {
            return this.f27052b;
        }
    }

    /* renamed from: o.hj8$c */
    public interface InterfaceC13984c {
        /* renamed from: a */
        Object mo30665a();

        /* renamed from: b */
        Uri mo30666b();

        /* renamed from: c */
        void mo30667c();

        /* renamed from: d */
        Uri mo30668d();

        ClipDescription getDescription();
    }

    public hj8(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f27049a = new C13982a(uri, clipDescription, uri2);
        } else {
            this.f27049a = new C13983b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static hj8 m30659f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new hj8(new C13982a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m30660a() {
        return this.f27049a.mo30666b();
    }

    /* renamed from: b */
    public ClipDescription m30661b() {
        return this.f27049a.getDescription();
    }

    /* renamed from: c */
    public Uri m30662c() {
        return this.f27049a.mo30668d();
    }

    /* renamed from: d */
    public void m30663d() {
        this.f27049a.mo30667c();
    }

    /* renamed from: e */
    public Object m30664e() {
        return this.f27049a.mo30665a();
    }

    /* renamed from: o.hj8$a */
    public static final class C13982a implements InterfaceC13984c {

        /* renamed from: a */
        public final InputContentInfo f27050a;

        public C13982a(Object obj) {
            this.f27050a = (InputContentInfo) obj;
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: a */
        public Object mo30665a() {
            return this.f27050a;
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: b */
        public Uri mo30666b() {
            return this.f27050a.getContentUri();
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: c */
        public void mo30667c() {
            this.f27050a.requestPermission();
        }

        @Override // p001o.hj8.InterfaceC13984c
        /* renamed from: d */
        public Uri mo30668d() {
            return this.f27050a.getLinkUri();
        }

        @Override // p001o.hj8.InterfaceC13984c
        public ClipDescription getDescription() {
            return this.f27050a.getDescription();
        }

        public C13982a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f27050a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public hj8(InterfaceC13984c interfaceC13984c) {
        this.f27049a = interfaceC13984c;
    }
}
