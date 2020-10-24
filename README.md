# Another Term Shell Plugin - Android&nbsp;10 Essentials

Essential shell tools for Android&nbsp;10 or higher.

***Warning:** this plugin has been SUSPENDED at Google Play as it*
>**currently facilitates or provides instructions on how to hack services,
>software or hardware, or circumvent security protections**
>and which violates the Device and Network Abuse policy,
>section 4.8 and 4.9 of the Developer Distribution Agreement (DDA)

*...without any comments on what exactly wrong. Weird.
Basically, all the JIT compilers for Android are endangered from now on.*

***So, use on your own risk and feel free to review and recompile it by yourself to be sure.***

It was created to mitigate
[the Android&nbsp;10 w^x policy](https://green-green-avk.github.io/AnotherTerm-docs/local-shell-w-x.html#main_content)
to still be able to run Linux applications in the **PRoot** environment
but also can be used with any API >= 21 for convenience.

It currently contains **minitar** (for extracting `.tar.gz`/`bz2`/`xz`) and **PRoot**.

Call without arguments for usage details.

Typical usage example:
```sh
$("$TERMSH" plugin green_green_avk.anothertermshellplugin_android10essentials minitar) < some.tar.xz
```

## Included binaries source code

Build scripts:
* <https://github.com/green-green-avk/build-libarchive-minitar-android>
* <https://github.com/green-green-avk/build-proot-android> ([make-proot-for-apk.sh](https://github.com/green-green-avk/build-proot-android/blob/master/make-proot-for-apk.sh))
