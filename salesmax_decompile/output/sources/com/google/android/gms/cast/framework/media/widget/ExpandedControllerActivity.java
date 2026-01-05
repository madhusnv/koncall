package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.internal.zzw;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.zzcq;
import com.google.android.gms.internal.cast.zzct;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.internal.cast.zzcw;
import com.google.android.gms.internal.cast.zzln;
import java.util.Timer;
import p001o.z5e;

/* loaded from: classes5.dex */
public abstract class ExpandedControllerActivity extends AppCompatActivity implements ControlButtonsContainer {
    private ImageView zzA;
    private int[] zzB;
    private View zzD;
    private View zzE;
    private ImageView zzF;
    private TextView zzG;
    private TextView zzH;
    private TextView zzI;
    private TextView zzJ;
    private UIMediaController zzK;
    private SessionManager zzL;
    private Cast.Listener zzM;
    private boolean zzN;
    private Timer zzO;
    private String zzP;

    @VisibleForTesting
    com.google.android.gms.cast.framework.media.internal.zzb zzc;

    @VisibleForTesting
    boolean zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private TextView zzw;
    private SeekBar zzx;
    private CastSeekBar zzy;
    private ImageView zzz;

    @VisibleForTesting
    final SessionManagerListener zza = new zzr(this, null);

    @VisibleForTesting
    final RemoteMediaClient.Listener zzb = new zzp(this, 0 == true ? 1 : 0);
    private final ImageView[] zzC = new ImageView[4];

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteMediaClient zzj() {
        CastSession currentCastSession = this.zzL.getCurrentCastSession();
        if (currentCastSession == null || !currentCastSession.isConnected()) {
            return null;
        }
        return currentCastSession.getRemoteMediaClient();
    }

    private final void zzk(String str) {
        this.zzc.zzd(Uri.parse(str));
        this.zzE.setVisibility(8);
    }

    private final void zzl(View view, int i, int i2, UIMediaController uIMediaController) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == C10905R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_play_pause_toggle) {
            imageView.setBackgroundResource(this.zze);
            Drawable drawableZzb = zzs.zzb(this, this.zzs, this.zzg);
            Drawable drawableZzb2 = zzs.zzb(this, this.zzs, this.zzf);
            Drawable drawableZzb3 = zzs.zzb(this, this.zzs, this.zzh);
            imageView.setImageDrawable(drawableZzb2);
            uIMediaController.bindImageViewToPlayPauseToggle(imageView, drawableZzb2, drawableZzb, drawableZzb3, null, false);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_skip_previous) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzi));
            imageView.setContentDescription(getResources().getString(C10905R.string.cast_skip_prev));
            uIMediaController.bindViewToSkipPrev(imageView, 0);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_skip_next) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzj));
            imageView.setContentDescription(getResources().getString(C10905R.string.cast_skip_next));
            uIMediaController.bindViewToSkipNext(imageView, 0);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_rewind_30_seconds) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzk));
            imageView.setContentDescription(getResources().getString(C10905R.string.cast_rewind_30));
            uIMediaController.bindViewToRewind(imageView, 30000L);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_forward_30_seconds) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzl));
            imageView.setContentDescription(getResources().getString(C10905R.string.cast_forward_30));
            uIMediaController.bindViewToForward(imageView, 30000L);
            return;
        }
        if (i2 == C10905R.id.cast_button_type_mute_toggle) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzm));
            uIMediaController.bindImageViewToMuteToggle(imageView);
        } else if (i2 == C10905R.id.cast_button_type_closed_caption) {
            imageView.setBackgroundResource(this.zze);
            imageView.setImageDrawable(zzs.zzb(this, this.zzs, this.zzn));
            uIMediaController.bindViewToClosedCaption(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(RemoteMediaClient remoteMediaClient) {
        MediaStatus mediaStatus;
        if (this.zzd || (mediaStatus = remoteMediaClient.getMediaStatus()) == null || remoteMediaClient.isBuffering()) {
            return;
        }
        this.zzI.setVisibility(8);
        this.zzJ.setVisibility(8);
        AdBreakClipInfo currentAdBreakClip = mediaStatus.getCurrentAdBreakClip();
        if (currentAdBreakClip == null || currentAdBreakClip.getWhenSkippableInMs() == -1) {
            return;
        }
        if (!this.zzN) {
            zzk zzkVar = new zzk(this, remoteMediaClient);
            Timer timer = new Timer();
            this.zzO = timer;
            timer.scheduleAtFixedRate(zzkVar, 0L, 500L);
            this.zzN = true;
        }
        if (currentAdBreakClip.getWhenSkippableInMs() - remoteMediaClient.getApproximateAdBreakClipPositionMs() > 0.0f) {
            this.zzJ.setVisibility(0);
            this.zzJ.setText(getResources().getString(C10905R.string.cast_expanded_controller_skip_ad_text, Integer.valueOf((int) Math.ceil(r10 / 1000.0f))));
            this.zzI.setClickable(false);
        } else {
            if (this.zzN) {
                this.zzO.cancel();
                this.zzN = false;
            }
            this.zzI.setVisibility(0);
            this.zzI.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        CastDevice castDevice;
        CastSession currentCastSession = this.zzL.getCurrentCastSession();
        if (currentCastSession != null && (castDevice = currentCastSession.getCastDevice()) != null) {
            String friendlyName = castDevice.getFriendlyName();
            if (!TextUtils.isEmpty(friendlyName)) {
                this.zzw.setText(getResources().getString(C10905R.string.cast_casting_to_device, friendlyName));
                return;
            }
        }
        this.zzw.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        MediaInfo mediaInfo;
        MediaMetadata metadata;
        ActionBar supportActionBar;
        RemoteMediaClient remoteMediaClientZzj = zzj();
        if (remoteMediaClientZzj == null || !remoteMediaClientZzj.hasMediaSession() || (mediaInfo = remoteMediaClientZzj.getMediaInfo()) == null || (metadata = mediaInfo.getMetadata()) == null || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.mo3754w(metadata.getString(MediaMetadata.KEY_TITLE));
        String strZze = zzw.zze(metadata);
        if (strZze != null) {
            supportActionBar.mo3753v(strZze);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public final void zzp() throws Resources.NotFoundException {
        MediaStatus mediaStatus;
        String string;
        Drawable drawable;
        Bitmap bitmap;
        Bitmap bitmapZza;
        RemoteMediaClient remoteMediaClientZzj = zzj();
        if (remoteMediaClientZzj == null || (mediaStatus = remoteMediaClientZzj.getMediaStatus()) == null) {
            return;
        }
        String imageUrl = null;
        if (!mediaStatus.isPlayingAd()) {
            this.zzJ.setVisibility(8);
            this.zzI.setVisibility(8);
            this.zzD.setVisibility(8);
            this.zzA.setVisibility(8);
            this.zzA.setImageBitmap(null);
            return;
        }
        if (this.zzA.getVisibility() == 8 && (drawable = this.zzz.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && (bitmapZza = zzs.zza(this, bitmap, 0.25f, 7.5f)) != null) {
            this.zzA.setImageBitmap(bitmapZza);
            this.zzA.setVisibility(0);
        }
        AdBreakClipInfo currentAdBreakClip = mediaStatus.getCurrentAdBreakClip();
        if (currentAdBreakClip != null) {
            String title = currentAdBreakClip.getTitle();
            imageUrl = currentAdBreakClip.getImageUrl();
            string = title;
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(imageUrl)) {
            zzk(imageUrl);
        } else if (TextUtils.isEmpty(this.zzP)) {
            this.zzG.setVisibility(0);
            this.zzE.setVisibility(0);
            this.zzF.setVisibility(8);
        } else {
            zzk(this.zzP);
        }
        TextView textView = this.zzH;
        if (TextUtils.isEmpty(string)) {
            string = getResources().getString(C10905R.string.cast_ad_label);
        }
        textView.setText(string);
        if (PlatformVersion.isAtLeastM()) {
            this.zzH.setTextAppearance(this.zzt);
        } else {
            this.zzH.setTextAppearance(this, this.zzt);
        }
        this.zzD.setVisibility(0);
        zzm(remoteMediaClientZzj);
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ControlButtonsContainer
    public final ImageView getButtonImageViewAt(int i) {
        return this.zzC[i];
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ControlButtonsContainer
    public final int getButtonSlotCount() {
        return 4;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ControlButtonsContainer
    public final int getButtonTypeAt(int i) {
        return this.zzB[i];
    }

    @Deprecated
    public SeekBar getSeekBar() {
        return this.zzx;
    }

    public TextView getStatusTextView() {
        return this.zzw;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ControlButtonsContainer
    public UIMediaController getUIMediaController() {
        return this.zzK;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        SessionManager sessionManager = CastContext.getSharedInstance(this).getSessionManager();
        this.zzL = sessionManager;
        if (sessionManager.getCurrentCastSession() == null) {
            finish();
        }
        UIMediaController uIMediaController = new UIMediaController(this);
        this.zzK = uIMediaController;
        uIMediaController.setPostRemoteMediaClientListener(this.zzb);
        setContentView(C10905R.layout.cast_expanded_controller_activity);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new int[]{z5e.selectableItemBackgroundBorderless});
        this.zze = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        zzm zzmVar = null;
        TypedArray typedArrayObtainStyledAttributes2 = obtainStyledAttributes(null, C10905R.styleable.CastExpandedController, C10905R.attr.castExpandedControllerStyle, C10905R.style.CastExpandedController);
        this.zzs = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castButtonColor, 0);
        this.zzf = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castPlayButtonDrawable, 0);
        this.zzg = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castPauseButtonDrawable, 0);
        this.zzh = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castStopButtonDrawable, 0);
        this.zzi = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castSkipPreviousButtonDrawable, 0);
        this.zzj = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castSkipNextButtonDrawable, 0);
        this.zzk = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castRewind30ButtonDrawable, 0);
        this.zzl = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castForward30ButtonDrawable, 0);
        this.zzm = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castMuteToggleButtonDrawable, 0);
        this.zzn = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castClosedCaptionsButtonDrawable, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castControlButtons, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
            Preconditions.checkArgument(typedArrayObtainTypedArray.length() == 4);
            this.zzB = new int[typedArrayObtainTypedArray.length()];
            for (int i = 0; i < typedArrayObtainTypedArray.length(); i++) {
                this.zzB[i] = typedArrayObtainTypedArray.getResourceId(i, 0);
            }
            typedArrayObtainTypedArray.recycle();
        } else {
            int i2 = C10905R.id.cast_button_type_empty;
            this.zzB = new int[]{i2, i2, i2, i2};
        }
        this.zzr = typedArrayObtainStyledAttributes2.getColor(C10905R.styleable.f11948xcb1f8bb1, 0);
        this.zzo = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdLabelColor, 0));
        this.zzp = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdInProgressTextColor, 0));
        this.zzq = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdLabelTextColor, 0));
        this.zzt = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdLabelTextAppearance, 0);
        this.zzu = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdInProgressLabelTextAppearance, 0);
        this.zzv = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castAdInProgressText, 0);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(C10905R.styleable.CastExpandedController_castDefaultAdPosterUrl, 0);
        if (resourceId2 != 0) {
            this.zzP = getApplicationContext().getResources().getString(resourceId2);
        }
        typedArrayObtainStyledAttributes2.recycle();
        View viewFindViewById = findViewById(C10905R.id.expanded_controller_layout);
        UIMediaController uIMediaController2 = this.zzK;
        this.zzz = (ImageView) viewFindViewById.findViewById(C10905R.id.background_image_view);
        this.zzA = (ImageView) viewFindViewById.findViewById(C10905R.id.blurred_background_image_view);
        View viewFindViewById2 = viewFindViewById.findViewById(C10905R.id.background_place_holder_image_view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        uIMediaController2.zzb(this.zzz, new ImageHints(4, displayMetrics.widthPixels, displayMetrics.heightPixels), viewFindViewById2, new zzn(this, zzmVar));
        this.zzw = (TextView) viewFindViewById.findViewById(C10905R.id.status_text);
        ProgressBar progressBar = (ProgressBar) viewFindViewById.findViewById(C10905R.id.loading_indicator);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i3 = this.zzr;
        if (i3 != 0) {
            indeterminateDrawable.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        uIMediaController2.bindViewToLoadingIndicator(progressBar);
        TextView textView = (TextView) viewFindViewById.findViewById(C10905R.id.start_text);
        TextView textView2 = (TextView) viewFindViewById.findViewById(C10905R.id.end_text);
        this.zzx = (SeekBar) viewFindViewById.findViewById(C10905R.id.seek_bar);
        CastSeekBar castSeekBar = (CastSeekBar) viewFindViewById.findViewById(C10905R.id.cast_seek_bar);
        this.zzy = castSeekBar;
        uIMediaController2.bindSeekBar(castSeekBar, 1000L);
        uIMediaController2.bindViewToUIController(textView, new zzcv(textView, uIMediaController2.zza()));
        uIMediaController2.bindViewToUIController(textView2, new zzct(textView2, uIMediaController2.zza()));
        View viewFindViewById3 = viewFindViewById.findViewById(C10905R.id.live_indicators);
        uIMediaController2.bindViewToUIController(viewFindViewById3, new zzcu(viewFindViewById3, uIMediaController2.zza()));
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById.findViewById(C10905R.id.tooltip_container);
        zzcq zzcwVar = new zzcw(relativeLayout, this.zzy, uIMediaController2.zza());
        uIMediaController2.bindViewToUIController(relativeLayout, zzcwVar);
        uIMediaController2.zzf(zzcwVar);
        this.zzC[0] = (ImageView) viewFindViewById.findViewById(C10905R.id.button_0);
        this.zzC[1] = (ImageView) viewFindViewById.findViewById(C10905R.id.button_1);
        this.zzC[2] = (ImageView) viewFindViewById.findViewById(C10905R.id.button_2);
        this.zzC[3] = (ImageView) viewFindViewById.findViewById(C10905R.id.button_3);
        zzl(viewFindViewById, C10905R.id.button_0, this.zzB[0], uIMediaController2);
        zzl(viewFindViewById, C10905R.id.button_1, this.zzB[1], uIMediaController2);
        zzl(viewFindViewById, C10905R.id.button_play_pause_toggle, C10905R.id.cast_button_type_play_pause_toggle, uIMediaController2);
        zzl(viewFindViewById, C10905R.id.button_2, this.zzB[2], uIMediaController2);
        zzl(viewFindViewById, C10905R.id.button_3, this.zzB[3], uIMediaController2);
        View viewFindViewById4 = findViewById(C10905R.id.ad_container);
        this.zzD = viewFindViewById4;
        this.zzF = (ImageView) viewFindViewById4.findViewById(C10905R.id.ad_image_view);
        this.zzE = this.zzD.findViewById(C10905R.id.ad_background_image_view);
        TextView textView3 = (TextView) this.zzD.findViewById(C10905R.id.ad_label);
        this.zzH = textView3;
        textView3.setTextColor(this.zzq);
        this.zzH.setBackgroundColor(this.zzo);
        this.zzG = (TextView) this.zzD.findViewById(C10905R.id.ad_in_progress_label);
        this.zzJ = (TextView) findViewById(C10905R.id.ad_skip_text);
        TextView textView4 = (TextView) findViewById(C10905R.id.ad_skip_button);
        this.zzI = textView4;
        textView4.setOnClickListener(new zzi(this));
        setSupportActionBar((Toolbar) findViewById(C10905R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo3750s(true);
            supportActionBar.mo3751t(C10905R.drawable.quantum_ic_keyboard_arrow_down_white_36);
        }
        zzn();
        zzo();
        if (this.zzG != null && this.zzv != 0) {
            if (PlatformVersion.isAtLeastM()) {
                this.zzG.setTextAppearance(this.zzu);
            } else {
                this.zzG.setTextAppearance(getApplicationContext(), this.zzu);
            }
            this.zzG.setTextColor(this.zzp);
            this.zzG.setText(this.zzv);
        }
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = new com.google.android.gms.cast.framework.media.internal.zzb(getApplicationContext(), new ImageHints(-1, this.zzF.getWidth(), this.zzF.getHeight()));
        this.zzc = zzbVar;
        zzbVar.zzc(new zzh(this));
        com.google.android.gms.internal.cast.zzr.zzd(zzln.CAF_EXPANDED_CONTROLLER);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.zzc.zza();
        UIMediaController uIMediaController = this.zzK;
        if (uIMediaController != null) {
            uIMediaController.setPostRemoteMediaClientListener(null);
            this.zzK.dispose();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        SessionManager sessionManager = this.zzL;
        if (sessionManager == null) {
            return;
        }
        CastSession currentCastSession = sessionManager.getCurrentCastSession();
        Cast.Listener listener = this.zzM;
        if (listener != null && currentCastSession != null) {
            currentCastSession.removeCastListener(listener);
            this.zzM = null;
        }
        this.zzL.removeSessionManagerListener(this.zza, CastSession.class);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws Resources.NotFoundException {
        SessionManager sessionManager = this.zzL;
        if (sessionManager == null) {
            return;
        }
        sessionManager.addSessionManagerListener(this.zza, CastSession.class);
        CastSession currentCastSession = this.zzL.getCurrentCastSession();
        if (currentCastSession == null || !(currentCastSession.isConnected() || currentCastSession.isConnecting())) {
            finish();
        } else {
            zzl zzlVar = new zzl(this);
            this.zzM = zzlVar;
            currentCastSession.addCastListener(zzlVar);
        }
        RemoteMediaClient remoteMediaClientZzj = zzj();
        boolean z = true;
        if (remoteMediaClientZzj != null && remoteMediaClientZzj.hasMediaSession()) {
            z = false;
        }
        this.zzd = z;
        zzn();
        zzp();
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            if (PlatformVersion.isAtLeastJellyBean()) {
                systemUiVisibility ^= 4;
            }
            if (PlatformVersion.isAtLeastKitKat()) {
                systemUiVisibility ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
            setImmersive(true);
        }
    }
}
