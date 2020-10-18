package green_green_avk.anothertermshellplugin;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import green_green_avk.anothertermshellplugin_android10essentials.R;
import green_green_avk.anothertermshellpluginutils.BaseShellService;
import green_green_avk.anothertermshellpluginutils.ExecutionContext;
import green_green_avk.anothertermshellpluginutils.Protocol;
import green_green_avk.anothertermshellpluginutils.Utils;

public final class ShellService extends BaseShellService {
    private static final Map<String, String> assets = new HashMap<>();

    static {
        assets.put("minitar", "libminitar.so");
        assets.put("proot", "libproot.so");
        assets.put("proot-userland", "libproot-userland.so");
    }

    @Override
    protected int onExec(@NonNull final ExecutionContext execCtx, @NonNull final byte[][] args,
                         @NonNull final ParcelFileDescriptor[] fds) {
        final OutputStream stdout = new FileOutputStream(fds[1].getFileDescriptor());
        final OutputStream stderr = new FileOutputStream(fds[2].getFileDescriptor());
        if (args.length == 1) {
            final String arg = Utils.fromUTF8(args[0]);
            if ("apk".equals(arg)) {
                Utils.write(stdout, getApplicationInfo().sourceDir + "\n");
                return 0;
            }
            final String asset = assets.get(arg);
            if (asset != null) {
                Utils.write(stdout, getApplicationInfo().nativeLibraryDir + "/" + asset + "\n");
                return 0;
            }
            Utils.write(stderr, "Unknown asset.\n");
        } else
            Utils.write(stderr,
                    "An asset name should be the only argument; its path will be returned.\n");
        Utils.write(stderr, "Please, specify one of: \u001B[1m" +
                TextUtils.join("\u001B[0m, \u001B[1m", assets.keySet()) +
                "\u001B[0m or \u001B[1mapk\u001B[0m for this plugin apk file path\n");
        return 1;
    }

    @Override
    protected Bundle onMeta() {
        final Bundle b = new Bundle();
        b.putInt(Protocol.META_KEY_INFO_RES_ID, R.string.desc_plugin);
        b.putInt(Protocol.META_KEY_INFO_RES_TYPE, Protocol.STRING_CONTENT_TYPE_XML_AT);
        return b;
    }
}
