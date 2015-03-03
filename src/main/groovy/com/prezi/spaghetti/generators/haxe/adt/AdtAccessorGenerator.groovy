package com.prezi.spaghetti.generators.haxe.adt

import com.prezi.spaghetti.ast.EnumNode
import com.prezi.spaghetti.ast.ModuleNode
import com.prezi.spaghetti.generator.AbstractHeaderGenerator
import com.prezi.spaghetti.generator.GeneratorParameters

class AdtAccessorGenerator extends AbstractHeaderGenerator {

	AdtAccessorGenerator() {
		super("haxe-adt")
	}

	@Override
	void generateHeaders(GeneratorParameters params, File outputDirectory) throws IOException {
		params.moduleConfiguration.allModules.each { ModuleNode module ->
			module.types.each { type ->
				if (type instanceof EnumNode && type.annotations.contains("adt")) {
					new File(outputDirectory, type.name) << "Hey, this is an ADT enum"
				}
			}
		}
	}
}
