# Another Term Shell Plugin - Android&nbsp;10 Essentials

***Warning:** this plugin has been SUSPENDED at Google Play as it*
>**currently facilitates or provides instructions on how to hack services,
>software or hardware, or circumvent security protections**
>and which violates the Device and Network Abuse policy,
>section 4.8 and 4.9 of the Developer Distribution Agreement (DDA)

*...without any details on what exactly wrong.
Basically, all the JIT compilers for Android can be suspended by Google from now on.*

***So, use on your own risk and feel free to review and recompile it by yourself to be sure.***

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/green-green-avk/AnotherTermShellPlugin-Android10Essentials)](https://github.com/green-green-avk/AnotherTermShellPlugin-Android10Essentials/releases)

This plugin for [**Another Term**](https://github.com/green-green-avk/AnotherTerm) has been created in order
to still be able to run Linux applications in the **PRoot** environment on Android&nbsp;10 (API&nbsp;29) and higher.
It can also be used with any API&nbsp;>=&nbsp;21 for convenience.

The implemented approach is not different from [**UserLAnd**](https://github.com/CypherpunkArmory/UserLAnd)
but separating it into a plugin seems more convenient.

[Details](https://green-green-avk.github.io/AnotherTerm-docs/local-shell-w-x.html#main_content)

It currently contains **minitar** (for extracting `.tar.gz`/`bz2`/`xz`) and **PRoot**.

Call without arguments for usage details.

Typical usage example:
```sh
$("$TERMSH" plugin green_green_avk.anothertermshellplugin_android10essentials minitar) < some.tar.xz
```

[Releases](https://github.com/green-green-avk/AnotherTermShellPlugin-Android10Essentials/releases)

## Included binaries source code

Build scripts:
* <https://github.com/green-green-avk/build-libarchive-minitar-android>
* <https://github.com/green-green-avk/build-proot-android> ([make-proot-for-apk.sh](https://github.com/green-green-avk/build-proot-android/blob/master/make-proot-for-apk.sh))
