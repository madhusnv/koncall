package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import java.lang.ref.WeakReference;
import p001o.c7b;
import p001o.wm;

/* loaded from: classes2.dex */
public class MediaRouteActionProvider extends wm {

    /* renamed from: d */
    public final C2319g f8898d;

    /* renamed from: e */
    public final C2299a f8899e;

    /* renamed from: f */
    public C2318f f8900f;

    /* renamed from: g */
    public c7b f8901g;

    /* renamed from: h */
    public MediaRouteButton f8902h;

    /* renamed from: i */
    public boolean f8903i;

    /* renamed from: androidx.mediarouter.app.MediaRouteActionProvider$a */
    public static final class C2299a extends C2319g.a {

        /* renamed from: a */
        public final WeakReference f8904a;

        public C2299a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f8904a = new WeakReference(mediaRouteActionProvider);
        }

        /* renamed from: a */
        public final void m7882a(C2319g c2319g) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.f8904a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.m7878o();
            } else {
                c2319g.m8249s(this);
            }
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderAdded(C2319g c2319g, C2319g.g gVar) {
            m7882a(c2319g);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderChanged(C2319g c2319g, C2319g.g gVar) {
            m7882a(c2319g);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onProviderRemoved(C2319g c2319g, C2319g.g gVar) {
            m7882a(c2319g);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
            m7882a(c2319g);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            m7882a(c2319g);
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
            m7882a(c2319g);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f8900f = C2318f.f9224c;
        this.f8901g = c7b.getDefault();
        this.f8898d = C2319g.m8234j(context);
        this.f8899e = new C2299a(this);
    }

    @Override // p001o.wm
    /* renamed from: c */
    public boolean mo7873c() {
        return this.f8903i || this.f8898d.m8248q(this.f8900f, 1);
    }

    @Override // p001o.wm
    /* renamed from: d */
    public View mo7874d() {
        MediaRouteButton mediaRouteButtonM7877n = m7877n();
        this.f8902h = mediaRouteButtonM7877n;
        mediaRouteButtonM7877n.setCheatSheetEnabled(true);
        this.f8902h.setRouteSelector(this.f8900f);
        this.f8902h.setAlwaysVisible(this.f8903i);
        this.f8902h.setDialogFactory(this.f8901g);
        this.f8902h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f8902h;
    }

    @Override // p001o.wm
    /* renamed from: f */
    public boolean mo7875f() {
        MediaRouteButton mediaRouteButton = this.f8902h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.m7886d();
        }
        return false;
    }

    @Override // p001o.wm
    /* renamed from: h */
    public boolean mo7876h() {
        return true;
    }

    /* renamed from: n */
    public MediaRouteButton m7877n() {
        return new MediaRouteButton(m54694a());
    }

    /* renamed from: o */
    public void m7878o() {
        m54698i();
    }

    /* renamed from: p */
    public void m7879p(boolean z) {
        if (this.f8903i != z) {
            this.f8903i = z;
            m54698i();
            MediaRouteButton mediaRouteButton = this.f8902h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setAlwaysVisible(this.f8903i);
            }
        }
    }

    /* renamed from: q */
    public void m7880q(c7b c7bVar) {
        if (c7bVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        if (this.f8901g != c7bVar) {
            this.f8901g = c7bVar;
            MediaRouteButton mediaRouteButton = this.f8902h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(c7bVar);
            }
        }
    }

    /* renamed from: r */
    public void m7881r(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f8900f.equals(c2318f)) {
            return;
        }
        if (!this.f8900f.m8224f()) {
            this.f8898d.m8249s(this.f8899e);
        }
        if (!c2318f.m8224f()) {
            this.f8898d.m8238a(c2318f, this.f8899e);
        }
        this.f8900f = c2318f;
        m7878o();
        MediaRouteButton mediaRouteButton = this.f8902h;
        if (mediaRouteButton != null) {
            mediaRouteButton.setRouteSelector(c2318f);
        }
    }
}
