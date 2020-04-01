package org.dlibj;

import com.sun.jna.Pointer;

import org.dlibj.NativeMethods;
import org.dlibj.StringHelper;

public class Dlib {

    public static String GetNativeVersion()
    {
        Pointer version = NativeMethods.DlibDotNetNative.INSTANCE.get_version();
        return StringHelper.FromStdString(version, true);
    }

}
