package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaUtils;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.images.WebImage;

/* loaded from: classes3.dex */
public final class zzbz extends UIController {
    private final ImageView zza;
    private final ImageHints zzb;
    private final Bitmap zzc;
    private final View zzd;
    private final ImagePicker zze;
    private final zzby zzf;
    private final com.google.android.gms.cast.framework.media.internal.zzb zzg;

    public zzbz(ImageView imageView, Context context, ImageHints imageHints, int i, View view, zzby zzbyVar) {
        this.zza = imageView;
        this.zzb = imageHints;
        this.zzf = zzbyVar;
        this.zzc = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.zzd = view;
        CastContext castContextZza = CastContext.zza(context);
        if (castContextZza != null) {
            CastMediaOptions castMediaOptions = castContextZza.getCastOptions().getCastMediaOptions();
            this.zze = castMediaOptions != null ? castMediaOptions.getImagePicker() : null;
        } else {
            this.zze = null;
        }
        this.zzg = new com.google.android.gms.cast.framework.media.internal.zzb(context.getApplicationContext());
    }

    private final void zzd() {
        View view = this.zzd;
        if (view != null) {
            view.setVisibility(0);
            this.zza.setVisibility(4);
        }
        Bitmap bitmap = this.zzc;
        if (bitmap != null) {
            this.zza.setImageBitmap(bitmap);
        }
    }

    private final void zze() {
        Uri imageUri;
        WebImage webImageOnPickImage;
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession()) {
            zzd();
            return;
        }
        MediaInfo mediaInfo = remoteMediaClient.getMediaInfo();
        if (mediaInfo == null) {
            imageUri = null;
        } else {
            MediaMetadata metadata = mediaInfo.getMetadata();
            ImagePicker imagePicker = this.zze;
            imageUri = (imagePicker == null || metadata == null || (webImageOnPickImage = imagePicker.onPickImage(metadata, this.zzb)) == null || webImageOnPickImage.getUrl() == null) ? MediaUtils.getImageUri(mediaInfo, 0) : webImageOnPickImage.getUrl();
        }
        if (imageUri == null) {
            zzd();
        } else {
            this.zzg.zzd(imageUri);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zze();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        this.zzg.zzc(new zzbx(this));
        zzd();
        zze();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        this.zzg.zza();
        zzd();
        super.onSessionEnded();
    }
}
