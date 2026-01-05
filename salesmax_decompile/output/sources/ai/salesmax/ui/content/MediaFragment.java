package ai.salesmax.ui.content;

import ai.salesmax.model.Template;
import ai.salesmax.ui.content.MediaFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.navigation.fragment.AbstractC2338a;
import java.net.URL;
import p001o.gq9;
import p001o.gu3;
import p001o.hae;
import p001o.j0f;
import p001o.je5;
import p001o.jm7;
import p001o.jnd;
import p001o.ph7;
import p001o.s2b;
import p001o.sq8;
import p001o.wx0;

/* loaded from: classes.dex */
public final class MediaFragment extends Fragment {

    /* renamed from: a */
    public ph7 f635a;

    /* renamed from: b */
    public Template f636b;

    /* renamed from: c */
    public ExoPlayer f637c;

    /* renamed from: ai.salesmax.ui.content.MediaFragment$a */
    public static final class C0348a implements gu3 {
        public C0348a() {
        }

        /* renamed from: c */
        public static final void m835c(MediaFragment mediaFragment, URL url) {
            sq8.m48649h(mediaFragment, "this$0");
            sq8.m48649h(url, "$it");
            PlayerView playerView = mediaFragment.I0().q0;
            sq8.m48648g(playerView, "mPlayer");
            if (!(playerView.getVisibility() == 0)) {
                mediaFragment.I0().q0.setVisibility(0);
            }
            ExoPlayer exoPlayer = mediaFragment.f637c;
            if (exoPlayer != null) {
                s2b s2bVarM47470a = new s2b.C16718c().m47476g(url.toString()).m47470a();
                sq8.m48648g(s2bVarM47470a, "build(...)");
                jnd jndVarMo6940e = new jnd.C14620b(new je5.C14508b()).mo6940e(s2bVarM47470a);
                sq8.m48648g(jndVarMo6940e, "createMediaSource(...)");
                exoPlayer.mo6829q(jndVarMo6940e);
                exoPlayer.mo31986n(s2bVarM47470a);
                exoPlayer.mo7137f();
                exoPlayer.mo7144s(true);
            }
        }

        @Override // p001o.gu3
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final URL url) {
            sq8.m48649h(url, "it");
            try {
                final MediaFragment mediaFragment = MediaFragment.this;
                j0f.m33008i(new Runnable() { // from class: o.r2b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaFragment.C0348a.m835c(mediaFragment, url);
                    }
                });
            } catch (Exception e) {
                e.toString();
                PlayerView playerView = MediaFragment.this.I0().q0;
                sq8.m48648g(playerView, "mPlayer");
                if (playerView.getVisibility() == 0) {
                    MediaFragment.this.I0().q0.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: ai.salesmax.ui.content.MediaFragment$b */
    public static final class C0349b implements gu3 {
        public C0349b() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            PlayerView playerView = MediaFragment.this.I0().q0;
            sq8.m48648g(playerView, "mPlayer");
            if (playerView.getVisibility() == 0) {
                MediaFragment.this.I0().q0.setVisibility(8);
            }
            jm7.v0(MediaFragment.this.requireActivity(), "Couldn't find file to play", 0, 0, 12, null);
        }
    }

    public static final void J0(MediaFragment mediaFragment, View view) {
        sq8.m48649h(mediaFragment, "this$0");
        AbstractC2338a.m8705a(mediaFragment).f0();
    }

    public final ph7 I0() {
        ph7 ph7Var = this.f635a;
        sq8.m48646e(ph7Var);
        return ph7Var;
    }

    public final void K0() {
        Template template = this.f636b;
        String fileUrl = template != null ? template.getFileUrl() : null;
        if (fileUrl != null) {
            gq9.m29294m(fileUrl).v0(new C0348a(), new C0349b());
            return;
        }
        PlayerView playerView = I0().q0;
        sq8.m48648g(playerView, "mPlayer");
        if (playerView.getVisibility() == 0) {
            I0().q0.setVisibility(8);
        }
    }

    public final void L0() {
        ExoPlayer exoPlayer = this.f637c;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f637c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        if (getArguments() != null) {
            this.f636b = (Template) requireArguments().getParcelable(getString(hae.argumentFile));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f635a == null) {
            this.f635a = ph7.h0(layoutInflater, viewGroup, false);
        }
        I0().o0.setOnClickListener(new View.OnClickListener() { // from class: o.q2b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaFragment.J0(this.f41175a, view);
            }
        });
        ExoPlayer exoPlayerM6842f = new ExoPlayer.C2189b(requireContext()).m6843l(wx0.f52810g, true).m6842f();
        I0().q0.setPlayer(exoPlayerM6842f);
        this.f637c = exoPlayerM6842f;
        View viewM25689B = I0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        L0();
        this.f635a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        Template template = this.f636b;
        if (template != null) {
            sq8.m48646e(template);
            String fileUrl = template.getFileUrl();
            if (fileUrl == null || fileUrl.length() == 0) {
                return;
            }
            K0();
        }
    }
}
