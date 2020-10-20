package com.bokeunjeong.portfolio.repository

import com.bokeunjeong.portfolio.dto.PortfolioSkillDto
import org.springframework.data.jpa.repository.JpaRepository


interface PortfolioSkillRepository : JpaRepository<PortfolioSkillDto, Int> {
    fun findBySkillNo(skillNo: Int): List<PortfolioSkillDto>
    fun findBySkillName(skillName: String): List<PortfolioSkillDto>
}