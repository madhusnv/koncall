package com.google.android.gms.internal.cast;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* loaded from: classes3.dex */
public final class zzcw extends zzcq {
    private final RelativeLayout zza;
    private final TextView zzb;
    private final CastSeekBar zzc;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzd;

    public zzcw(RelativeLayout relativeLayout, CastSeekBar castSeekBar, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) throws Resources.NotFoundException {
        this.zza = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(C10905R.id.tooltip);
        this.zzb = textView;
        this.zzc = castSeekBar;
        this.zzd = zzaVar;
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, C10905R.styleable.CastExpandedController, C10905R.attr.castExpandedControllerStyle, C10905R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C10905R.styleable.CastExpandedController_castSeekBarTooltipBackgroundColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzd();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        zzd();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        super.onSessionEnded();
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zza(boolean z) {
        super.zza(z);
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zzb(long j) {
        zzd();
    }

    public final void zzd() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || zzc()) {
            this.zza.setVisibility(8);
            return;
        }
        this.zza.setVisibility(0);
        TextView textView = this.zzb;
        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = this.zzd;
        textView.setText(zzaVar.zzl(this.zzc.getProgress() + zzaVar.zze()));
        int measuredWidth = (this.zzc.getMeasuredWidth() - this.zzc.getPaddingLeft()) - this.zzc.getPaddingRight();
        this.zzb.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.zzb.getMeasuredWidth();
        int iMin = Math.min(Math.max(0, ((int) ((this.zzc.getProgress() / this.zzc.getMaxProgress()) * measuredWidth)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.zzb.getLayoutParams();
        layoutParams.leftMargin = iMin;
        this.zzb.setLayoutParams(layoutParams);
    }
}
