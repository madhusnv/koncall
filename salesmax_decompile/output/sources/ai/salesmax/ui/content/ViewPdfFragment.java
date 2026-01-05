package ai.salesmax.ui.content;

import ai.salesmax.model.Template;
import ai.salesmax.ui.content.ViewPdfFragment;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.DialogC10973a;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import p001o.dic;
import p001o.gq9;
import p001o.gu3;
import p001o.hae;
import p001o.j0f;
import p001o.jm7;
import p001o.k7e;
import p001o.kj7;
import p001o.qae;
import p001o.sq8;
import p001o.wvi;

/* loaded from: classes.dex */
public final class ViewPdfFragment extends BottomSheetDialogFragment {

    /* renamed from: b */
    public ViewPager2 f666b;

    /* renamed from: c */
    public ParcelFileDescriptor f667c;

    /* renamed from: d */
    public dic f668d;

    /* renamed from: e */
    public Template f669e;

    /* renamed from: f */
    public kj7 f670f;

    /* renamed from: ai.salesmax.ui.content.ViewPdfFragment$a */
    public static final class C0357a implements gu3 {
        public C0357a() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(File file) {
            sq8.m48649h(file, "it");
            MaterialTextView materialTextView = ViewPdfFragment.this.U0().r0;
            Template template = ViewPdfFragment.this.f669e;
            sq8.m48646e(template);
            materialTextView.setText(template.getFileName());
            try {
                ViewPdfFragment.this.X0(file);
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    /* renamed from: ai.salesmax.ui.content.ViewPdfFragment$b */
    public static final class C0358b implements gu3 {
        public C0358b() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            jm7.v0(ViewPdfFragment.this.requireActivity(), "Couldn't find file to attach", 0, 0, 12, null);
        }
    }

    public static final void T0(ViewPdfFragment viewPdfFragment) {
        sq8.m48649h(viewPdfFragment, "this$0");
        jm7.v0(viewPdfFragment.requireActivity(), "File download started", 0, 0, 12, null);
    }

    public static final void Y0(int i, int i2, View view, float f) {
        sq8.m48649h(view, "page");
        ViewParent parent = view.getParent().getParent();
        sq8.m48647f(parent, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 viewPager2 = (ViewPager2) parent;
        float f2 = f * (-((i * 2) + i2));
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f2);
        } else if (wvi.m55139z(viewPager2) == 1) {
            view.setTranslationX(-f2);
        } else {
            view.setTranslationX(f2);
        }
    }

    public static final void Z0(ViewPdfFragment viewPdfFragment, View view) {
        sq8.m48649h(viewPdfFragment, "this$0");
        viewPdfFragment.dismiss();
    }

    public static final void a1(ViewPdfFragment viewPdfFragment, View view) {
        sq8.m48649h(viewPdfFragment, "this$0");
        Template template = viewPdfFragment.f669e;
        if (template != null) {
            sq8.m48646e(template);
            URL urlM29295n = gq9.m29295n(template.getFileUrl());
            Context contextRequireContext = viewPdfFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            String string = urlM29295n.toString();
            sq8.m48648g(string, "toString(...)");
            Template template2 = viewPdfFragment.f669e;
            sq8.m48646e(template2);
            viewPdfFragment.S0(contextRequireContext, string, template2.getFileName());
        }
    }

    public final void S0(Context context, String str, String str2) {
        DownloadManager.Request destinationInExternalFilesDir = new DownloadManager.Request(Uri.parse(str)).setTitle(str2).setDescription("Downloading").setNotificationVisibility(1).setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOWNLOADS, str2);
        Object systemService = context.getSystemService("download");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(destinationInExternalFilesDir);
        j0f.m33008i(new Runnable() { // from class: o.dyi
            @Override // java.lang.Runnable
            public final void run() {
                ViewPdfFragment.T0(this.f20656a);
            }
        });
    }

    public final kj7 U0() {
        kj7 kj7Var = this.f670f;
        sq8.m48646e(kj7Var);
        return kj7Var;
    }

    public final void V0() {
        Context contextRequireContext = requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        Object filesDir = contextRequireContext.getFilesDir();
        if (filesDir == null) {
            filesDir = "";
        }
        Template template = this.f669e;
        sq8.m48646e(template);
        File file = new File(filesDir + template.getFileName());
        Template template2 = this.f669e;
        sq8.m48646e(template2);
        gq9.m29293l(template2.getFileUrl(), file).v0(new C0357a(), new C0358b());
    }

    public final ViewPager2 W0() {
        ViewPager2 viewPager2 = this.f666b;
        if (viewPager2 != null) {
            return viewPager2;
        }
        sq8.m48667z("pageViewPager");
        return null;
    }

    public final void X0(File file) {
        try {
            U0().t0.setVisibility(0);
            U0().o0.setVisibility(8);
            this.f667c = ParcelFileDescriptor.open(file, 268435456);
            ParcelFileDescriptor parcelFileDescriptor = this.f667c;
            sq8.m48646e(parcelFileDescriptor);
            Context contextRequireContext = requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            this.f668d = new dic(parcelFileDescriptor, contextRequireContext);
            W0().setAdapter(this.f668d);
        } catch (Exception unused) {
            file.delete();
        }
    }

    public final void b1(ViewPager2 viewPager2) {
        sq8.m48649h(viewPager2, "<set-?>");
        this.f666b = viewPager2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        if (getArguments() != null) {
            this.f669e = (Template) requireArguments().getParcelable(getString(hae.argumentFile));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        DialogC10973a dialogC10973a = new DialogC10973a(requireContext(), qae.SheetDialog);
        dialogC10973a.m14201k().Z0(3);
        return dialogC10973a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f670f == null) {
            this.f670f = kj7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = U0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws IOException {
        super.onDestroyView();
        ParcelFileDescriptor parcelFileDescriptor = this.f667c;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
        dic dicVar = this.f668d;
        if (dicVar != null) {
            dicVar.m23301d();
        }
        this.f670f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        ViewPager2 viewPager2 = U0().t0;
        sq8.m48648g(viewPager2, "pageViewPager");
        b1(viewPager2);
        ViewPager2 viewPager2W0 = W0();
        viewPager2W0.setClipToPadding(false);
        viewPager2W0.setClipChildren(false);
        viewPager2W0.setOffscreenPageLimit(3);
        final int dimensionPixelOffset = getResources().getDimensionPixelOffset(k7e.pageMargin);
        final int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(k7e.offset);
        W0().setPageTransformer(new ViewPager2.InterfaceC2556k() { // from class: o.ayi
            @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC2556k
            /* renamed from: a */
            public final void mo10062a(View view2, float f) {
                ViewPdfFragment.Y0(dimensionPixelOffset2, dimensionPixelOffset, view2, f);
            }
        });
        Template template = this.f669e;
        if (template != null) {
            sq8.m48646e(template);
            String fileUrl = template.getFileUrl();
            if (!(fileUrl == null || fileUrl.length() == 0)) {
                V0();
            }
        }
        U0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.byi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewPdfFragment.Z0(this.f16974a, view2);
            }
        });
        U0().q0.setOnClickListener(new View.OnClickListener() { // from class: o.cyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewPdfFragment.a1(this.f18852a, view2);
            }
        });
    }
}
