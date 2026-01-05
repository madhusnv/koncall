package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.C10546R;
import com.amplifyframework.logging.Logger;

/* loaded from: classes5.dex */
public final class DevMenuEnvironmentFragment extends Fragment {
    private static final Logger LOG = Amplify.Logging.logger("amplify:devmenu");

    private SpannableStringBuilder getEnvironmentInfo() {
        String developerEnvironmentInfo;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        EnvironmentInfo environmentInfo = new EnvironmentInfo();
        spannableStringBuilder.append((CharSequence) setBold("Amplify Plugins Information"));
        spannableStringBuilder.append((CharSequence) ("\n" + environmentInfo.getPluginVersions() + "\n"));
        spannableStringBuilder.append((CharSequence) setBold("Developer Environment Information"));
        try {
            developerEnvironmentInfo = environmentInfo.getDeveloperEnvironmentInfo(requireContext());
        } catch (AmplifyException unused) {
            LOG.warn("Error reading developer environment information.");
            developerEnvironmentInfo = "";
        }
        if (developerEnvironmentInfo.isEmpty()) {
            spannableStringBuilder.append((CharSequence) "\nUnable to retrieve developer environment information.");
        } else {
            spannableStringBuilder.append((CharSequence) ("\n" + developerEnvironmentInfo));
        }
        return spannableStringBuilder;
    }

    private SpannableString setBold(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        return spannableString;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C10546R.layout.dev_menu_fragment_environment, viewGroup, false);
        ((TextView) viewInflate.findViewById(C10546R.id.env_info_text)).setText(getEnvironmentInfo());
        return viewInflate;
    }
}
