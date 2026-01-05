package com.google.android.gms.internal.cast;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.b7b;
import p001o.b8e;

/* loaded from: classes3.dex */
public final class zzy extends b7b implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final Logger zzh = new Logger("DeviceChooserDialog");
    TextView zza;
    ListView zzb;
    View zzc;
    LinearLayout zzd;
    LinearLayout zze;
    LinearLayout zzf;
    RelativeLayout zzg;
    private final zzw zzi;
    private final List zzj;
    private final long zzk;
    private final boolean zzl;
    private C2319g zzm;
    private zzdy zzn;
    private C2318f zzo;
    private ArrayAdapter zzp;
    private boolean zzq;
    private Runnable zzr;
    private C2319g.h zzs;

    public zzy(Context context, int i) {
        super(context, 0);
        this.zzj = new CopyOnWriteArrayList();
        this.zzo = C2318f.f9224c;
        this.zzi = new zzw(this);
        this.zzk = zzac.zza();
        this.zzl = zzac.zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        C2319g c2319g = this.zzm;
        if (c2319g != null) {
            ArrayList arrayList = new ArrayList(c2319g.m8246m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, zzx.zza);
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zza(arrayList);
            }
        }
    }

    private final void zzg() {
        Logger logger = zzh;
        logger.m13795d("startDiscovery", new Object[0]);
        C2319g c2319g = this.zzm;
        if (c2319g == null) {
            logger.m13795d("Can't start discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c2319g.m8239b(this.zzo, this.zzi, 1);
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzc(1);
        }
    }

    private final void zzh() {
        Logger logger = zzh;
        logger.m13795d("stopDiscovery", new Object[0]);
        C2319g c2319g = this.zzm;
        if (c2319g == null) {
            logger.m13795d("Can't stop discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c2319g.m8249s(this.zzi);
        this.zzm.m8239b(this.zzo, this.zzi, 0);
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzd();
        }
    }

    private final void zzi(int i) {
        if (this.zzd == null || this.zze == null || this.zzf == null || this.zzg == null) {
            return;
        }
        CastContext sharedInstance = CastContext.getSharedInstance();
        if (this.zzl && sharedInstance != null && !sharedInstance.zzf().zza()) {
            i = 3;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            setTitle(C10905R.string.cast_device_chooser_title);
            ((LinearLayout) Preconditions.checkNotNull(this.zzd)).setVisibility(0);
            ((LinearLayout) Preconditions.checkNotNull(this.zze)).setVisibility(8);
            ((LinearLayout) Preconditions.checkNotNull(this.zzf)).setVisibility(8);
            ((RelativeLayout) Preconditions.checkNotNull(this.zzg)).setVisibility(8);
            return;
        }
        if (i2 != 1) {
            setTitle(C10905R.string.cast_wifi_warning_title);
            ((LinearLayout) Preconditions.checkNotNull(this.zzd)).setVisibility(8);
            ((LinearLayout) Preconditions.checkNotNull(this.zze)).setVisibility(8);
            ((LinearLayout) Preconditions.checkNotNull(this.zzf)).setVisibility(0);
            ((RelativeLayout) Preconditions.checkNotNull(this.zzg)).setVisibility(0);
            return;
        }
        setTitle(C10905R.string.cast_device_chooser_title);
        ((LinearLayout) Preconditions.checkNotNull(this.zzd)).setVisibility(8);
        ((LinearLayout) Preconditions.checkNotNull(this.zze)).setVisibility(0);
        ((LinearLayout) Preconditions.checkNotNull(this.zzf)).setVisibility(8);
        ((RelativeLayout) Preconditions.checkNotNull(this.zzg)).setVisibility(0);
    }

    @Override // p001o.dk0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        zzdy zzdyVar = this.zzn;
        if (zzdyVar != null) {
            zzdyVar.removeCallbacks(this.zzr);
        }
        View view = this.zzc;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(this.zzs);
        }
        this.zzj.clear();
    }

    public final C2318f getRouteSelector() {
        return this.zzo;
    }

    @Override // p001o.b7b, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zzq = true;
        zzg();
        zzf();
    }

    @Override // p001o.b7b, p001o.dk0, p001o.fn3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) super.findViewById(b8e.mr_chooser_list);
        if (listView == null) {
            return;
        }
        setContentView(C10905R.layout.cast_device_chooser_dialog);
        this.zzp = (ArrayAdapter) listView.getAdapter();
        ListView listView2 = (ListView) findViewById(C10905R.id.cast_device_chooser_list);
        this.zzb = listView2;
        if (listView2 != null) {
            listView2.setAdapter((ListAdapter) this.zzp);
            this.zzb.setOnItemClickListener(listView.getOnItemClickListener());
        }
        this.zza = (TextView) findViewById(C10905R.id.cast_device_chooser_title);
        this.zzd = (LinearLayout) findViewById(C10905R.id.cast_device_chooser_searching);
        this.zze = (LinearLayout) findViewById(C10905R.id.cast_device_chooser_zero_devices);
        this.zzf = (LinearLayout) findViewById(C10905R.id.cast_device_chooser_wifi_warning);
        this.zzg = (RelativeLayout) findViewById(C10905R.id.footer);
        TextView textView = (TextView) findViewById(C10905R.id.cast_device_chooser_learn_more);
        TextView textView2 = (TextView) findViewById(C10905R.id.cast_device_chooser_wifi_warning_description);
        zzt zztVar = new zzt(this);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnClickListener(zztVar);
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setOnClickListener(zztVar);
        }
        Button button = (Button) findViewById(C10905R.id.done_button);
        if (button != null) {
            button.setOnClickListener(new zzu(this));
        }
        View viewFindViewById = findViewById(R.id.empty);
        this.zzc = viewFindViewById;
        if (this.zzb != null && viewFindViewById != null) {
            ((View) Preconditions.checkNotNull(viewFindViewById)).getViewTreeObserver().addOnGlobalLayoutListener(this);
            ((ListView) Preconditions.checkNotNull(this.zzb)).setEmptyView((View) Preconditions.checkNotNull(this.zzc));
        }
        this.zzr = new Runnable() { // from class: com.google.android.gms.internal.cast.zzs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        };
    }

    @Override // p001o.b7b, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.zzq = false;
        super.onDetachedFromWindow();
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.zzc;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        int visibility = this.zzc.getVisibility();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            if (visibility == 0) {
                zzi(1);
                zzdy zzdyVar = this.zzn;
                if (zzdyVar != null) {
                    zzdyVar.removeCallbacks(this.zzr);
                    this.zzn.postDelayed(this.zzr, this.zzk);
                }
            } else {
                setTitle(C10905R.string.cast_device_chooser_title);
            }
            ((View) Preconditions.checkNotNull(this.zzc)).setTag(Integer.valueOf(visibility));
        }
    }

    @Override // p001o.b7b
    public final void refreshRoutes() {
        super.refreshRoutes();
        zzf();
    }

    @Override // p001o.b7b
    public final void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        super.setRouteSelector(c2318f);
        if (this.zzo.equals(c2318f)) {
            return;
        }
        this.zzo = c2318f;
        zzh();
        if (this.zzq) {
            zzg();
        }
        zzf();
    }

    @Override // p001o.b7b, p001o.dk0, android.app.Dialog
    public final void setTitle(int i) {
        TextView textView = this.zza;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final /* synthetic */ void zzd() {
        zzi(2);
        for (zzv zzvVar : this.zzj) {
        }
    }

    public final void zze() {
        this.zzm = C2319g.m8234j(getContext());
        this.zzn = new zzdy(Looper.getMainLooper());
        zzv zzvVarZza = zzp.zza();
        if (zzvVarZza != null) {
            this.zzj.add(zzvVarZza);
        }
    }

    @Override // p001o.b7b, p001o.dk0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.zza;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
