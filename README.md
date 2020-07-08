Welcome to Ultracraft Beta! <br>
<small>Current Version: 1.0.0.51 (Released 2020-07-xx)</small>

<h4>Warnings and Notes</h4>
* This mod pack is the replacement of EnhancedCraft, as it broke in 1.16, making it discontinued. However, it's not an update of Enhancedcraft. This is a different modpack that uses some blocks from that mod.
* Please note this README is also a change log.
* Please be aware that this is a beta, and is not available on PlanetMinecraft. You have to build the mod manually using IntelliJ or Eclipse to run the beta. This is to avoid moderation from PlanetMinecraft because of duplication 
    * A statement will be released on [r/DieselDorky16](http://www.reddit.com/r/dieseldorky16) soon, so follow my reddit to recieve it!.
* This mod also changes the default textures for Vanilla Minecraft. Please be aware that some textures may look different than normal. This is to fix any parity issues in Vanilla Minecraft.
* Requires latest version of 1.16.1 Forge Beta
* Report any issues on the bug tracker on GitHub, please. Don't use JIRA.

<h6>How To Install</h6>
<small>Open your commandline (Terminal, Run, etc.) and navigate to the Ultracraft folder using `cd (path)/Ultracraft-master`, then run `gradlew build` (`./gradlew build` for macOS users). The exported mod should be in `Ultracraft-master/build/libs`</small>.

<h4>Changes in beta 1.0.0.51</h4>
<h6>Nether Iron Ore</h6>
* Spawns in all nether biomes, but very rare to find.
* The loot tables is the same as with Nether Gold Ore.
    * You can use Silk Touch to get the block itself, then smelt it in a furnace for iron ingots.
    * You can fortune the ore to get loads of iron nuggets, then craft them for iron ingots.
    * You can mine the ore with any tool, and drops iron nuggets by default.
* Block properties are the same as Nether Gold Ore.
<h6>Recipes</h6>
* Blackstone can now be used to craft brewing stands
<h4>Fixed Bugs in beta 1.0.0.51</h4>
* Upon exporting using `gradlew build`, the version and mod_id is read as `modid-1.0.jar` instead of the correct naming setup.
* `group` parameter in file `build.gradle` uses placeholder instead of the mod's current path in `main/java`
* Issue tracker link uses placeholder
* Soul Shroomlights are not compostable, unlike Shroomlights.

[r/DieselDorky16]: http://www.reddit.com/r/dieseldorky16