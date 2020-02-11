@file:GenerateMods(name = "Mod", mc = "1.12.2")
@file:GenerateMods(name = "Mod", mc = "1.12.1")
@file:GenerateMods(name = "Mod", mc = "1.12")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.2")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.1")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12")
@file:GenerateForge(name = "Forge", mc = "1.12.2")

mcVersion = "1.12.2"
title = "Center of the Multiverse - Tech Edition"
authors = listOf("AnsuzThuriaz")
version = "0.1test1"
forge = Forge.mc1_12_2.forge_14_23_5_2847
icon = rootDir.resolve("icon.png")
pack {
    skcraft {
        userFiles = UserFiles(
                include = listOf(
                        "options.txt"
                ),
                exclude = listOf("")
        )
    }
}

pack {
    multimc {
        skPackUrl = "https://centerofthemultiverse.net/launcher/cotm.json"
    }
}
root(CurseProvider) {
    releaseTypes = setOf(FileType.Release, FileType.Beta, FileType.Alpha)
    validMcVersions = setOf("1.12.2", "1.12.1", "1.12")
    list {

        // Vazkii
        +(Mod.akashicTome)
        +(Mod.psi)
        +(Mod.quark)
        +(Mod.quarkOddities)
        +(Mod.morphOTool)
        +(Mod.patchouli)

        // Sangar
        +(Mod.architect)

        // Nuchaz
        +(Mod.bibliocraft)

        // chiselTeam
        +(Mod.chisel)

        // AlgorithmX2
        +(Mod.chiselsBits)

        // jaredlll08
        +(Mod.clumps)

        // TheIllusiveC4
        +(Mod.comforts)

        // BlayTheNinth
        +(Mod.cookingForBlockheads)
        +(Mod.farmingForBlockheads)

        // ZLainSama
        +(Mod.cosmeticArmorReworked)

        // copygirl
        +(Mod.wearableBackpacks)

        // mezz
        +(Mod.jei)

        // The_Wabbit
        +(Mod.upsizerMod)

        // Viesis
        +(Mod.viescraftAirships)

        // Team CoFH
        +(Mod.thermalDynamics)
        +(Mod.thermalExpansion)
        +(Mod.thermalInnovation)

        // mcjty
        +(Mod.rftools)
        +(Mod.rftoolsDimensions)
        +(Mod.rftoolsPower)
        +(Mod.theOneProbe)

        // zabi94
        +(Mod.extraAlchemy)

        // CrazyPants
        +(Mod.enderIo)

        // Subaraki
        +(Mod.paintings)

        +(Mod.baubles)

        // TheRandomLabs
        +(Mod.randomtweaks)
        +(Mod.randompatches)

        // asie
        +(Mod.charsetLib)
        +(Mod.charsetTweaks)
        +(Mod.charsetBlockCarrying)
        +(Mod.charsetTablet)
        +(Mod.charsetCrafting)
        +(Mod.charsetAudio)
        +(Mod.charsetStorageLocks)
        +(Mod.charsetTools)
        +(Mod.charsetpatches)
        +(Mod.charsetImmersion)
        +(Mod.foamfixForMinecraft)
        +(Mod.preston)
        +(Mod.unlimitedChiselWorks)

        // dimms
        +(Mod.theLostCities)

        // unresolved/stubborn/forced dependencies
        +(Mod.mantle)
        +(Mod.librarianlib)
        +(Mod.shadowfactsForgelin)
        +(Mod.bookshelf)
        +(Mod.placebo)
        +(Mod.numina)

        // unsorted mods
        +(Mod.enderStorage18)
        +(Mod.exchangers)
        +(Mod.extraBitManipulation)
        +(Mod.extraUtilities)
        +(Mod.fairyLights)
        +(Mod.ftbUtilities)
        +(Mod.ftblib)
        +(Mod.initialInventory)
        +(Mod.inventoryTweaks)
        +(Mod.metalchests)
        +(Mod.redstonePaste)
        +(Mod.mmmmmmmmmmmm)
        +(Mod.kleeslabs)
        +(Mod.malisisdoors)
        +(Mod.mobGrindingUtils)
        +(Mod.natura)
        +(Mod.naturesCompass)
        +(Mod.netherex)
        +(Mod.netherportalfix)
        +(Mod.notenoughids)
        +(Mod.opencomputers)
        +(Mod.openblocks)
        +(Mod.pamsHarvestcraft)
        +(Mod.passthroughSigns)
        +(Mod.randomThings)
        +(Mod.rangedPumps)
        +(Mod.recurrentComplex)
        +(Mod.redstoneFlux)
        +(Mod.roguelikeDungeons)
        +(Mod.scannable)
        +(Mod.simpleSponge)
        +(Mod.spartanShields)
        +(Mod.storageDrawers)
        +(Mod.storageDrawersExtras)
        +(Mod.tails)
        +(Mod.tinkersConstruct)
        +(Mod.tinkersToolLeveling)
        +(Mod.extremeReactors)
        +(Mod.zerocore)
        +(Mod.toolBelt)
        +(Mod.torchmaster)
        +(Mod.roboticparts)
        +(Mod.quickLeafDecay)
        +(Mod.constructsArmory)
        +(Mod.yoyos)
        +(Mod.badWitherNoCookieReloaded)
        +(Mod.corpseComplex)
        +(Mod.peckish)
        +(Mod.fastworkbench)
        +(Mod.fastfurnace)
        +(Mod.betterBuildersWands)
        +(Mod.antighost)
        +(Mod.loginShield)
        +(Mod.caliper)
        +(Mod.flopper)
        +(Mod.wallJump)
        +(Mod.magicalMap)
        +(Mod.pewter)
        +(Mod.grapplingHookMod)
        +(Mod.outfox)
        +(Mod.chococraft3)
        +(Mod.portality)
        +(Mod.surge)
        +(Mod.armoryExpansion)
        +(Mod.theDisenchanterMod)
        +(Mod.doggyTalents)
        +(Mod.snad)
        +(Mod.compactdrawers)
        +(Mod.blockcraftery)
        +(Mod.modularPowersuits)
        +(Mod.colytra)
        +(Mod.architecturecraftTridev)
        +(Mod.futureMc)
        +(Mod.phosphor)
        +(Mod.aiImprovements)
        +(Mod.placebo)
        +(Mod.actuallyAdditions)
        +(Mod.advancedRocketry)
        +(Mod.endMetals)
        +(Mod.netherMetals)
        +(Mod.denseMetals)
        +(Mod.buildingGadgets)
        +(Mod.stevesCartsReborn)
        +(Mod.culinaryConstruct)
        +(Mod.openmodularturrets)
        +(Mod.bedPatch)
        +(Mod.crafttweaker)
        +(Mod.modtweaker)
        +(Mod.randomPsideas)
        +(Mod.projectIntelligence)
        +(Mod.customMainMenu)
        +(Mod.plustic)
        +(Mod.spiceOfLifeCarrotEdition)
        +(Mod.maxPotionIdExtender)
        +(Mod.calculator)
        +(Mod.bedPatch)
        +(Mod.minetweakerRecipemaker)
        +(Mod.dragonDropsElytra)
        +(Mod.bonsaiTrees)
        +(Mod.chestTransporter)
        +(Mod.avaritia110)
        +(Mod.industrialForegoing)
        +(Mod.tinkersComplement)
        +(Mod.claySoldiersMod)
        +(Mod.notenoughcodecs)
        +(Mod.mcmultipart)
        +(Mod.environmentalTech)
        +(Mod.immersiveEngineering)
        +(Mod.matteroverdrive)
        +(Mod.mekanism)
        +(Mod.mekanismGenerators)
        +(Mod.mekanismTools)
        +(Mod.mekanismores)
        +(Mod.futurepack)
        +(Mod.appliedEnergistics2)
        +(Mod.cathedral)
        +(Mod.decocraft)
        +(Mod.yungsBetterCaves)
        +(Mod.deepMobLearning)
        +(Mod.biomesOPlenty)
        +(Mod.apotheosis)
        +(Mod.cyclic)
        +(Mod.engineersDecor)
        +(Mod.engineersTools)
        +(Mod.engineersDoors)
        +(Mod.embersRekindled)
        +(Mod.soot)

        withProvider(DirectProvider).list {
            +"Nutrition" configure {
                url = "https://github.com/WesCook/Nutrition/releases/download/v4.4.0/Nutrition-1.12.2-4.4.0.jar"
            }
        }

        withProvider(JenkinsProvider) {
            jenkinsUrl = "https://ci.elytradev.com"
        }.list {
            // b0undrybreaker
            +"infra-redstone" job "elytra/InfraRedstone/1.12.2"

            // Falkreon
            +"thermionics" job "elytra/Thermionics/master"
            +"thermionics-world" job "elytra/ThermionicsWorld/master"
            +"engination" job "elytra/Engination/master"
        }

        group {
            side = Side.SERVER
        }.list {
            +(Mod.btfuContinuousRsyncIncrementalBackup)
            +(Mod.swingthroughgrass)
            +(Mod.colorchat)
            +(Mod.dcintegration)
        }

        group {
            side = Side.BOTH
            optional {
                selected = false
            }

        }.list {

            +(Mod.laggoggles) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.sampler) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.openeye) configure {
                description =
                        "Automatically collects and submits crash reports. Enable if asked or wish to help sort issues with the pack."
            }
        }

        group {
            side = Side.CLIENT
        }.list {
            +(Mod.toastControl)
            +(Mod.jeiIntegration)
            +(Mod.appleskin)
            +(Mod.betterfps)
            +(Mod.nonausea)
            +(Mod.betterPlacement)
            +(Mod.controlling)
            +(Mod.defaultOptions)
            +(Mod.fullscreenWindowedBorderlessForMinecraft)
            +(Mod.modNameTooltip)
            +(Mod.reauth)
            +(Mod.cleanview)
            +(Mod.craftingTweaks)
            +(Mod.betterAdvancements)
            +(Mod.tinkersJei)
            +(Mod.lootCapacitorTooltips)
            +(Mod.justEnoughHarvestcraft)
            +(Mod.justEnoughResourcesJer)

            // OPT-OUT
            group {
                optional {
                    selected = true
                    skRecommendation = Recommendation.starred
                }
            }.list {

                +(Mod.journeymap) configure {
                    description = "Mod-compatible mini-map."
                }

                +(Mod.mage) configure {
                    description = "Configurable graphics enhancements. Highly recomended."
                }

                +(Mod.neat) configure {
                    description = "Simple health and unit frames."
                }

                +(Mod.clientTweaks) configure {
                    description = "Various client related fixes and tweaks, all in a handy menu."
                }

                +(Mod.mouseTweaks) configure {
                    description = "Add extra mouse gestures for inventories and crafting grids."
                }

                +(Mod.smoothFont) configure {
                    description = "It smoothes fonts."
                }

                +(Mod.inventoryTweaks) configure {
                    description = "Adds amll changes to invetory handling to minor conviniences."
                }

                +(Mod.customFov) configure {
                    description = "Removes dynamic FOV shifting due to ingame effects."
                }
            }
            // OPT-IN
            group {
                optional {
                    selected = false
                }
            }.list {

//                +(Mod.betterFoliage) configure {
//                    description = "Improves the flora in the world. Very heavy, but very pretty. (Sane defaults set.)"
//                }

//                +(Mod.justEnoughHarvestcraft) configure {
//                    description = "JEI Integration for Pam's HarvestCraft."
//                }

//                +(Mod.justEnoughResourcesJer) configure {
//                    description = "JEI Integration that gives drop-rates for mobs, dungeon loot, etc."
//                }

//                +(Mod.itemScroller) configure {
//                    description = "Alternative to MouseTweaks."
//                }

//                +(Mod.xaerosMinimap) configure {
//                    description = "Alternative to Journeymap."
//                }

                +(Mod.minemenu) configure {
                    description =
                            "Radial menu that can be used for command/keyboard shortcuts. Some keybinds cannot be added to radial menu."
                }

                +(Mod.itemzoom) configure {
                    description = "Enable this if you like to get a closer look at item textures."
                }

                +(Mod.lightLevelOverlayReloaded) configure {
                    description = "Smol light-level overlay if you aren't using Dynamic Surroundings."
                }

                +(Mod.durabilityShow) configure {
                    description = "Toggle-able item/tool/armor durability HUD. Duplicates with RPG-HUD."
                }

//                +(Mod.fancyBlockParticles) configure {
//                    description =
//                            "Caution: Resource heavy. Adds some flair to particle effects and animations. Highly configurable, costs fps."
//                }

//                +(Mod.dynamicSurroundings) configure {
//                    description =
//                            "Caution: Resource heavy. Lots of configurable features that add immersive sound/visual effects. Includes light-level overlay."
//                }

//                +(Mod.chunkAnimator) configure {
//                    description = "Configurable chunk pop-in animator."
//                }

                +(Mod.fasterLadderClimbing) configure {
                    description = "Helps you control ladder climb speed and allows you to go a bit faster."
                }

                // Resource packs
                +TexturePack.unity configure {
                    fileName = "Unity.zip"
                    description = "Multi-mod compatible resource pack."
                }

                withProvider(DirectProvider).list {
                    +"Slice" configure {
                        description = "Custom client font based off of Chicago. Made by Falkreon."
                        folder = "resourcepacks"
                        url = "https://centerofthemultiverse.net/launcher/mirror/Slice.zip"
                    }
                }
            }
        }
    }
}