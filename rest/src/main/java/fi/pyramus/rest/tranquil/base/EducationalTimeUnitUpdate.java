package fi.pyramus.rest.tranquil.base;

import fi.tranquil.TranquilModel;
import fi.tranquil.TranquilModelType;

@TranquilModel (entityClass = fi.pyramus.domainmodel.base.EducationalTimeUnit.class, entityType = TranquilModelType.UPDATE)
public class EducationalTimeUnitUpdate extends EducationalTimeUnitComplete {

  public final static String[] properties = {};
}
