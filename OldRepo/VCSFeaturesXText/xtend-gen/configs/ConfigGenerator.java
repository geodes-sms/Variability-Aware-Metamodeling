package configs;

import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public interface ConfigGenerator {
  CharSequence generate(final Resource resource);
}
