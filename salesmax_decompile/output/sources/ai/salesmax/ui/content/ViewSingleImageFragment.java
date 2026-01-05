package ai.salesmax.ui.content;

import ai.salesmax.model.FileData;
import ai.salesmax.ui.content.ViewSingleImageFragment;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.DialogC10973a;
import java.net.URL;
import p001o.gq9;
import p001o.hae;
import p001o.j0f;
import p001o.jm7;
import p001o.mj7;
import p001o.qae;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ViewSingleImageFragment extends BottomSheetDialogFragment {

    /* renamed from: b */
    public FileData f673b;

    /* renamed from: c */
    public mj7 f674c;

    /* renamed from: d */
    public long f675d;

    /* renamed from: e */
    public final BroadcastReceiver f676e = new BroadcastReceiver() { // from class: ai.salesmax.ui.content.ViewSingleImageFragment$onDownloadComplete$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sq8.m48649h(context, "context");
            sq8.m48649h(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra == this.f677a.f675d) {
                Object systemService = context.getSystemService("download");
                sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                Uri uriForDownloadedFile = ((DownloadManager) systemService).getUriForDownloadedFile(longExtra);
                if (uriForDownloadedFile != null) {
                    ViewSingleImageFragment viewSingleImageFragment = this.f677a;
                    if (viewSingleImageFragment.isAdded()) {
                        viewSingleImageFragment.V0(uriForDownloadedFile);
                    }
                }
            }
        }
    };

    public static final void R0(ViewSingleImageFragment viewSingleImageFragment) {
        sq8.m48649h(viewSingleImageFragment, "this$0");
        jm7.v0(viewSingleImageFragment.requireActivity(), "File download started", 0, 0, 12, null);
    }

    public static final void T0(ViewSingleImageFragment viewSingleImageFragment, View view) {
        sq8.m48649h(viewSingleImageFragment, "this$0");
        viewSingleImageFragment.dismiss();
    }

    public static final void U0(ViewSingleImageFragment viewSingleImageFragment, View view) {
        sq8.m48649h(viewSingleImageFragment, "this$0");
        FileData fileData = viewSingleImageFragment.f673b;
        sq8.m48646e(fileData);
        URL urlM29295n = gq9.m29295n(fileData.getUploadedUri());
        Context contextRequireContext = viewSingleImageFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        String string = urlM29295n.toString();
        sq8.m48648g(string, "toString(...)");
        FileData fileData2 = viewSingleImageFragment.f673b;
        sq8.m48646e(fileData2);
        viewSingleImageFragment.Q0(contextRequireContext, string, fileData2.getFileName());
    }

    public final void Q0(Context context, String str, String str2) {
        DownloadManager.Request destinationInExternalFilesDir = new DownloadManager.Request(Uri.parse(str)).setTitle(str2).setDescription("Downloading image to share").setNotificationVisibility(1).setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOWNLOADS, str2);
        Object systemService = context.getSystemService("download");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        this.f675d = ((DownloadManager) systemService).enqueue(destinationInExternalFilesDir);
        j0f.m33008i(new Runnable() { // from class: o.gzi
            @Override // java.lang.Runnable
            public final void run() {
                ViewSingleImageFragment.R0(this.f26028a);
            }
        });
    }

    public final mj7 S0() {
        mj7 mj7Var = this.f674c;
        sq8.m48646e(mj7Var);
        return mj7Var;
    }

    public final void V0(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, getString(hae.share_image_via)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        if (getArguments() != null) {
            this.f673b = (FileData) requireArguments().getParcelable(getString(hae.argumentFile));
        }
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
        if (this.f674c == null) {
            this.f674c = mj7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = S0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        try {
            requireContext().unregisterReceiver(this.f676e);
        } catch (IllegalArgumentException unused) {
        }
        this.f674c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        S0().j0(this.f673b);
        S0().o0.setOnClickListener(new View.OnClickListener() { // from class: o.ezi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewSingleImageFragment.T0(this.f22462a, view2);
            }
        });
        S0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.fzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewSingleImageFragment.U0(this.f24310a, view2);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            requireContext().registerReceiver(this.f676e, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            requireContext().registerReceiver(this.f676e, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }
}
