package cn.nit.card.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;
import cn.nit.card.model.Card;
import org.lightadmin.api.config.utils.EnumElement;

/**
 * Created by Administrator on 14-6-9.
 */
public class CardAdministration extends AdministrationConfiguration<Card> {

    public EntityMetadataConfigurationUnit configuration( EntityMetadataConfigurationUnitBuilder configurationBuilder ) {
        return configurationBuilder.nameField( "word" ).build();
    }

    public ScreenContextConfigurationUnit screenContext( ScreenContextConfigurationUnitBuilder screenContextBuilder ) {
        return screenContextBuilder
                .screenName( "Cards Administration" )
                .build();
    }

    public FieldSetConfigurationUnit listView( final FieldSetConfigurationUnitBuilder fragmentBuilder ) {
        return fragmentBuilder
                .field( "word" ).caption( "单词" )
                .field("imgURL1").caption( "第一张图片" )
                .field( "imgURL2" ).caption( "第二张图片" )
                .field( "imgURL3" ).caption( "第三张图片" )
                .field( "choice" ).caption( "选择第几张图片" ).enumeration(EnumElement.element( 1, "第一张图片" ),
                        EnumElement.element( 2, "第二张图片" ),
                        EnumElement.element( 3, "第三张图片" ))
                .build();
    }

    public FieldSetConfigurationUnit formView( final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder ) {
        return fragmentBuilder
                .field( "word" ).caption( "单词" )
                .field("imgURL1").caption( "第一张图片" )
                .field( "imgURL2" ).caption( "第二张图片" )
                .field( "imgURL3" ).caption( "第三张图片" )
                .field("choice").caption("选择第几张图片").enumeration(EnumElement.element(1, "第一张图片"),
                        EnumElement.element(2, "第二张图片"),
                        EnumElement.element(3, "第三张图片")).build();
    }
}
